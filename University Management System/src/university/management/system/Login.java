
package university.management.system;

import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame implements ActionListener{
    
    
    JButton login, cancel;
    JTextField tfUserName, tfUserPassword;
    
    Login(){
        
//        for color change 
        getContentPane().setBackground( Color.WHITE);


//        for layout change
        setLayout(null);
        
        JLabel userName = new JLabel("User Name : ");
        userName.setBounds(40,20,100,20);
        add(userName);
        
        tfUserName = new JTextField();
        tfUserName.setBounds(140,20,150,20);
        add(tfUserName);
        
        
        
        
        
        
        JLabel userPassword= new JLabel("Password : ");
        userPassword.setBounds(40,70,100,20);
        add(userPassword);
        
        tfUserPassword = new JPasswordField();
        tfUserPassword.setBounds(140,70,150,20);
        add(tfUserPassword);
        
        
        
        
        
        
        login = new JButton("Login");
        login.addActionListener(this);
        login.setBounds(40,140,100,30);
//        login.setBackground(Color.BLACK);
//        login.setForeground(Color.WHITE);
//        login.addActionListener(this);
//        login.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(login);
        
        cancel  = new JButton("Cancel");
        cancel.addActionListener(this);
        cancel.setBounds(180,140,100,30);
//        cancel.setBackground(Color.BLACK);
//        cancel.setForeground(Color.WHITE);
//        cancel.addActionListener(this);
//        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/clg_icon.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(200 , 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,20,200,200);
        add(image);
        
        
        
        
        
        
        

        setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== login){
            String username = tfUserName.getText();
            String password = tfUserPassword.getText();
            
            String query = "select * from login where username='"+username+"' and password='"+password+"'";  // step 4 : executing mysql query
            
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next()){
                    setVisible(false);
                    new Project();
                }else {
                    JOptionPane.showMessageDialog(null, "You have entered wrong Username or password");
//                    setVisible(false);
                        }
                c.s.close(); // step 5 : close connetion
            }catch(Exception ae){
                ae.printStackTrace();
            }
            
        }else if(e.getSource()== cancel){
            setVisible(false);
        }
        
    };
    
    
    public static void main(String args[]){
        new Login();
        
    }
    
}
