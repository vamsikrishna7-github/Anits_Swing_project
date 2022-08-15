package app;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class index {
	
	public index() {
		JFrame f=new JFrame("Anil Neerukonda Institute of Technology and Sciences");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("/home/mrx/eclipse-workspace/app/src/img/imgonline-com-ua-resize-iCMQZYkzAw6lt.jpg");
		JLabel j1 = new JLabel(img);
		j1.setAlignmentX(1000);
		j1.setAlignmentY(1000);
		f.add(j1);
		
		//JTabbedPane p = new JTabbedPane(JTabbedPane.TOP);
		//p.add("Home", new Home());
		//p.add("About Us", new About());
		//f.add(p);
		JButton b1 = new JButton("Home");
		f.add(b1);
		b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			            new index();
			        }  
			    });  
		
		JButton b2 = new JButton("Admissions");
		f.add(b2);
		b2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					new Admissions();
			            
			        }  
			    });  
		JButton bn=new JButton("Faculty");
		f.add(bn);
		bn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Faculty();
			}
		});
		
		JButton b3 = new JButton("Departments");
		f.add(b3);
		b3.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			            new Departments();
			        }  
			    });  
		
		JButton b4 = new JButton("Infrastructure");
		f.add(b4);
		b4.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				new Infrastructure();
			        }  
			    });  
		
		JButton b5 = new JButton("Contact Us");
		f.add(b5);
		b5.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			            new Contact();
			        }  
			    });  
		
		
		JButton b6 = new JButton("About Us");
		f.add(b6);
		b6.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			            new About();
			        }  
			    });  
		
		
		f.setSize(900, 700);
		f.setVisible(true);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
	}

	public static void main(String[] args)throws Exception {
		new index();
		
	}

}

class Home extends JFrame{
	Home(){
	JButton b=new JButton("Click me");
	this.add(b);
	}
}
class About extends JFrame{
	About(){
		this.setTitle("About");
		this.setSize(900, 700);
        this.setVisible(true);
		
	}
}
/*class Admissions extends JFrame{
	Admissions(){
		this.setTitle("Admissions");
		this.setSize(900, 700);
        this.setVisible(true);
		
	}
	
}*/

class Faculty {
	Faculty(){
		new Login();		
	}
	
}

class Departments extends JFrame{
	Departments(){
		this.setTitle("Department");
		this.setSize(900, 700);
        this.setVisible(true);
		
	}
}

class Infrastructure extends JFrame{
	Infrastructure(){
		this.setTitle("Infrastructure");
		this.setSize(900, 700);
        this.setVisible(true);
		
	}
}

class Contact extends JFrame{
	Contact(){
		this.setTitle("Contact");
		this.setSize(900, 700);
		this.setVisible(true);
	}
}