package Class;


import java.awt.event.*;

import javax.swing.*;


public class Example extends JFrame 
{
	 JLabel l1,l2,l3,l4;
	 JTextField t1,t2;
	 JButton b1;
	 
	  public Example()
	  {
		  
	  }
	  
	  public Example(String s)
	  {
		  super(s);
	  }

	  public void setComponents() 
	  {
		  //label object 
		  l1= new JLabel("Addition of Two Numbers!");
		  l2 = new JLabel ("First Number");
		  l3 = new JLabel ("Second Number");
		  l4 = new JLabel();
		  
		  //text Field
		  t1 =new JTextField();
		  t2 = new JTextField();
		  //t3 =new JTextField();
		  
		  //Button
		  b1 = new JButton("Add");
		
		  
		  //setting the layout or user interface
	  setLayout(null);
	   l1.setBounds(100, 50, 200,20);
	   l2.setBounds(50,80,200,20);
	   t1.setBounds(150,80 , 200,20);
	   l3.setBounds(50,130,200,20);
	   t2.setBounds(150,130,200,20);
	   b1.setBounds(150, 180, 200,20);
	   l4.setBounds(50,220,200,20);
	   //t3.setBounds(150, 220,150,20);
	   
	   //add a layout with the add method
	   b1.addActionListener( new Sum()); 
	   add(l1);
	   add(l2);
	   add(t1);
	   add(l3);
	   add(t2);
	   add(b1);
	   add(l4);
	   //add(t3);
	   
	  }
	  
	 
	  
	  class Sum implements ActionListener 
	  {
   

	@Override
	public void actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(t1.getText());
		int b= Integer.parseInt(t2.getText());
		int s= a+b;
		l4.setText("Result is  "+s);
		
		
	}
	  }
	public static void main(String[] args)
	{
	Example e= new Example("Calculator");
	
      
	   e.setComponents();
	   e.setSize(500,400);
	   e.setVisible(true);
	   e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	}

}
