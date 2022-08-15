package app;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

 

public class Report 
{
	Report(String username, String pass){
    try 
  {
    	Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/anits","vamsi","root");  
				Statement stmt=con.createStatement();  
	
      String query = "select *from admin;";
      ResultSet res = stmt.executeQuery(query);
    
      String columns[] = { "ID", "Name", "Age", "Contact", "FatherName", "MotherName", "Gender", "Address", "District", "State", "Pincode"};
      String data[][] = new String[100][11];
    
      int i = 0;
      while (res.next()) {
        int id = res.getInt("id");
        String nome = res.getString("name");
        int age = res.getInt("age");
        String contact = res.getString("contact");
        String fatherName = res.getString("fatherName");
        String motherName = res.getString("motherName");
        String gender = res.getString("gender");
        String address = res.getString("address");
        String district = res.getString("district");
        String state = res.getString("state");
        int pincode = res.getInt("pincode");
        data[i][0] = id + "";
        data[i][1] = nome;
        data[i][2] = age + "";
        data[i][3] = contact;
        data[i][4] = fatherName;
        data[i][5] = motherName;
        data[i][6] = gender;
        data[i][7] = address;
        data[i][8] = district;
        data[i][9] = state;
        data[i][10] = pincode + "";
        i++;
      }
    
      DefaultTableModel model = new DefaultTableModel(data, columns);
      JTable table = new JTable(model);
     table.setRowHeight(30);
      TableColumnModel columnModel = table.getColumnModel();
      columnModel.getColumn(0).setPreferredWidth(15);
      columnModel.getColumn(1).setPreferredWidth(200);
      columnModel.getColumn(2).setPreferredWidth(20);
      columnModel.getColumn(3).setPreferredWidth(200);
      columnModel.getColumn(4).setPreferredWidth(200);
      columnModel.getColumn(5).setPreferredWidth(100);
      columnModel.getColumn(6).setPreferredWidth(100);
      columnModel.getColumn(7).setPreferredWidth(100);
      columnModel.getColumn(8).setPreferredWidth(30);
      columnModel.getColumn(9).setPreferredWidth(100);
      JScrollPane scroll = new JScrollPane(table);
      table.setFillsViewportHeight(true);
      JLabel labelHead = new JLabel("List of employees");
      labelHead.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
      
      JFrame f = new JFrame("Report");
      f.getContentPane().add(labelHead,BorderLayout.PAGE_START);
      f.getContentPane().add(scroll,BorderLayout.CENTER);
     f.setSize(1920, 1080);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    
    } catch(SQLException e) {
      e.printStackTrace();
    }
    
  }
	
}
