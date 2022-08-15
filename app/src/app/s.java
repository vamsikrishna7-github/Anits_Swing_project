package app;

import javax.swing.*;
import java.awt.*;

public class s {    
    JFrame f;    
    s(){    
    f=new JFrame();    
    String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};    
    
    String column[]={"ID","NAME","AGE","GENDER","MAIL","PHONE"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(900, 700);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new s();    
}    
}  