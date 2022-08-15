package app;
import mysql.db;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Admissions{
	 JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	 JFrame f;
	Admissions(){
        f=new JFrame();


        JLabel l1=new JLabel("Name");
        l1.setBounds(60,50,200,35);
        l1.setFont(new Font("calibri", Font.BOLD, 25));
        l1.setForeground(Color.white);

        JLabel l2=new JLabel("Age");
        l2.setBounds(60,100,200,35);
        l2.setFont(new Font("calibri", Font.BOLD, 25));
        l2.setForeground(Color.white);

        JLabel l3=new JLabel("Contact");
        l3.setBounds(60,150,200,35);
        l3.setFont(new Font("calibri", Font.BOLD, 25));
        l3.setForeground(Color.white);

        JLabel l4=new JLabel("Father Name");
        l4.setBounds(60,200,200,35);
        l4.setFont(new Font("calibri", Font.BOLD, 25));
        l4.setForeground(Color.white);

        JLabel l5=new JLabel("Mother Name");
        l5.setBounds(60,250,200,35);
        l5.setFont(new Font("calibri", Font.BOLD, 25));
        l5.setForeground(Color.white);

        JLabel l6=new JLabel("Gender");
        l6.setBounds(60,300,200,35);
        l6.setFont(new Font("calibri", Font.BOLD, 25));
        l6.setForeground(Color.white);
       
        JLabel l7=new JLabel("Address");
        l7.setBounds(60,350,200,35);
        l7.setFont(new Font("calibri", Font.BOLD, 25));
        l7.setForeground(Color.white);
       
        JLabel l8=new JLabel("District");
        l8.setBounds(60,400,200,35);
        l8.setFont(new Font("calibri", Font.BOLD, 25));
        l8.setForeground(Color.white);
       
        JLabel l9=new JLabel("State");
        l9.setBounds(60,450,200,35);
        l9.setFont(new Font("calibri", Font.BOLD, 25));
        l9.setForeground(Color.white);
        //JComboBox c1 = new JComboBox();
        //solve s = new solve();
        //String s1[] = {"Andhra Pradesh","Telengana","Karnataka","Tamilnadu","Kerala","Goa"};
        //c1 = new JComboBox();
        //c1.addItemListener(s);
       
        JLabel l10=new JLabel("Pincode");
        l10.setBounds(60,500,200,35);
        l10.setFont(new Font("calibri", Font.BOLD, 25));
        l10.setForeground(Color.white);
       
        t1=new JTextField();
        t1.setBounds(250,50,200,35);

        t2=new JTextField();
        t2.setBounds(250,100,200,35);

        t3=new JTextField();
        t3.setBounds(250,150,200,35);

        t4=new JTextField();
        t4.setBounds(250,200,200,35);

        t5=new JTextField();
        t5.setBounds(250,250,200,35);
       
        t6=new JTextField();
        t6.setBounds(250,300,200,35);
       
        t7=new JTextField();
        t7.setBounds(250,350,200,35);
       
        t8=new JTextField();
        t8.setBounds(250,400,200,35);
       
        t9=new JTextField();
        t9.setBounds(250,450,200,35);
       
        t10=new JTextField();
        t10.setBounds(250,500,200,35);
       
        f.getContentPane().setBackground(new Color(5, 65, 90));
        //f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Downloads\\anits.jpg")));
        f.setSize(900,700);
        f.setLayout(null);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(t7);
        f.add(t8);
        f.add(t9);
        f.add(t10);
        JButton b1=new JButton("Submit");
        b1.setBounds(100,600,200,35);
        b1.setFont(new Font("calibri", Font.BOLD, 25));
        b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			            System.out.print("button clicked");
			            String name=t1.getText();
			            int age=Integer.parseInt(t2.getText());
			            String contact=t3.getText();
			            String fatherName=t4.getText();
			            String motherName=t5.getText();
			            String gender=t6.getText();
			            String address=t7.getText();
			            String district=t8.getText();
			            String state=t9.getText();
			            int pincode=Integer.parseInt(t10.getText());
			            
			            String query="INSERT INTO admin (name, age, contact, fatherName, motherName, gender, address, district, state, pincode) VALUES('"+name+"',"+age+",'"+contact+"','"+fatherName+"','"+motherName+"','"+gender+"','"+address+"','"+district+"','"+state+"',"+pincode+");";
			            try {
			    		Connection con=DriverManager.getConnection(  
			    				"jdbc:mysql://localhost:3306/anits","vamsi","root");  
			    				Statement stmt=con.createStatement();  
			    				stmt.executeUpdate(query);
			    				stmt.executeUpdate("COMMIT;"); 
			    				con.close();
			    				System.out.print("1 row inserted");
			    				f.dispose(); 
			            }
			            catch(Exception ec) {
			            	System.out.print("Exception in database"+ec);
			            }
			          
			            
			}}); 
        
        f.add(b1);
       
        
        
        f.setVisible(true);
        

    }
       
}

 