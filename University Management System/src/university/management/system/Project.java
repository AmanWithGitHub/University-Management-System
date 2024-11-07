package university.management.system;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.*;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Project extends JFrame implements ActionListener{
    
    Project(){
        setSize(1540,850);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/thir.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
//        New INformation 
        JMenu newInformation = new JMenu("New Information");
        mb.setBackground(Color.lightGray);
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.addActionListener(this);
        facultyInfo.setBackground(Color.WHITE);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.addActionListener(this);
        studentInfo.setBackground(Color.WHITE);
        newInformation.add(studentInfo);
        
        
//        Details
        JMenu Details = new JMenu("View detail");
        Details.setForeground(Color.RED);
        mb.add(Details);
        
        JMenuItem facultyDetail = new JMenuItem("View Faculty Detail");
        facultyDetail.addActionListener(this);
        facultyDetail.setBackground(Color.WHITE);
        Details.add(facultyDetail);
        
        JMenuItem studentDetail = new JMenuItem("View Student Detail");
        studentDetail.addActionListener(this);
        studentDetail.setBackground(Color.WHITE);
        Details.add(studentDetail);
        
        
        
        //        leave
//        JMenu leave = new JMenu("Apply Leave");
//        leave.setForeground(Color.BLUE);
//        mb.add(leave);
//        
//        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
//        facultyLeave.setBackground(Color.WHITE);
//        leave.add(facultyLeave);
//        
//        JMenuItem studentLeave = new JMenuItem("Student Leave");
//        studentLeave.setBackground(Color.WHITE);
//        leave.add(studentLeave);
        
        
        
        
         //        leave Detail
//        JMenu leaveDetails = new JMenu("Leave detail");
//        leaveDetails.setForeground(Color.RED);
//        mb.add(leaveDetails);
//        
//        JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
//        facultyLeaveDetails.setBackground(Color.WHITE);
//        leaveDetails.add(facultyLeaveDetails);
//        
//        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
//        studentLeaveDetails.setBackground(Color.WHITE);
//        leaveDetails.add(studentLeaveDetails);
        
        
        
        
        
        
         //       Exam 
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);
        
        JMenuItem examinationResult = new JMenuItem("Exam Result");
        examinationResult.addActionListener(this);
        examinationResult.setBackground(Color.WHITE);
        exam.add(examinationResult);
        
        JMenuItem enterMarks = new JMenuItem("Enter Marks");
        enterMarks.addActionListener(this);
        enterMarks.setBackground(Color.WHITE);
        exam.add(enterMarks);

        
        
        
        
        
        // UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.addActionListener(this);
        updatefacultyinfo.setBackground(Color.WHITE);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.addActionListener(this);
        updatestudentinfo.setBackground(Color.WHITE);
        updateInfo.add(updatestudentinfo);
        
        
        
        
        
        
        
        // fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.addActionListener(this);
        feestructure.setBackground(Color.WHITE);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.addActionListener(this);
        feeform.setBackground(Color.WHITE);
        fee.add(feeform);
        
        
        
        
        
        
        // Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this); 
        utility.add(calc);
        
        
        
        
        
        
        
        
        // about
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLUE);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.addActionListener(this);
        ab.setBackground(Color.WHITE);
        about.add(ab);
        
        
        
        
        
        
        
        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        
        
        
        
        setJMenuBar(mb);
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
            String msg = ae.getActionCommand();
            if (msg == "Exit"){
                setVisible(false);
            }else if(msg.equals("Calculator")){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){
                    System.out.println(e);
                }
                
            }
            else if(msg.equals("Notepad") ){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){
                    System.out.println(e);
            }
            }else if(msg.equals("New Faculty Information")){
                new AddTeacher();
                
            }else if(msg.equals("New Student Information")){
                new AddStudent();
                
            }else if(msg.equals("View Faculty Detail")){
                new TeacherDetails();
                
            }else if(msg.equals("View Student Detail")){
                new StudentDetails();
                
            }else if(msg.equals("Update Faculty Details")){
                new UpdateTeacher();
                
            }else if(msg.equals("Update Student Details")){
                new UpdateStudent();
                
            }else if(msg.equals("Enter Marks")){
                new EnterMarks();
                
            }else if(msg.equals("Exam Result")){
                new ExaminationDetails();
                
            }else if(msg.equals("Fee Structure")){
                new FeeStructure();
                
            }else if(msg.equals("Student Fee Form")){
                new StudentFeeForm();
                
            }else if(msg.equals("About")){
                try{
                    String url = "https://www.bciit.ac.in/";

        // Check if Desktop is supported on the current platform
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();
            // Open the URL in the default browser
                        desktop.browse(new URI(url));
                    } else {
                            System.out.println("Desktop is not supported on your platform.");
        }
                    
                }catch(Exception e){
                    System.out.println(e);
                }
            }
    } 
    
    public static void main(String args[]){
        new Project();
    }
}
