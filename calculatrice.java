/**
 * @(#)calculatrice.java
 *
 *
 * @author 
 * @version 1.00 2014/3/19
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class calculatrice extends JFrame implements ActionListener {

float aux=0;
float res=0;
String op="";


JTextField t1=new JTextField();

JButton b7=new JButton("7") ;JButton b8=new JButton("8") ;JButton b9=new JButton("9") ;JButton b17=new JButton("Sin") ;JButton b18=new JButton("X²") ;
JButton b4=new JButton("4") ;JButton b5=new JButton("5") ;JButton b6=new JButton("6") ;JButton b19=new JButton("cos") ;JButton b20=new JButton("x^y") ;
JButton b1=new JButton("1") ;JButton b2=new JButton("2") ;JButton b3=new JButton("3") ;JButton b21=new JButton("Tan") ;JButton b22=new JButton("Sqrt") ;
JButton b10=new JButton("0") ;JButton b11=new JButton("*") ;JButton b12=new JButton("-") ;JButton b23=new JButton("e") ;JButton b24=new JButton("1/x") ;
JButton b13=new JButton("/") ;JButton b14=new JButton("+") ;JButton b15=new JButton("C") ;JButton b25=new JButton("n!") ;JButton b26=new JButton("Log") ;
JButton b16=new JButton("=") ;







  public calculatrice()
  {
  
  	
  	JPanel p1=new JPanel();  
    p1.setLayout(new GridLayout(5,5));
		p1.add(b7);p1.add(b8);p1.add(b9);p1.add(b17);p1.add(b18);
		p1.add(b4);p1.add(b5);p1.add(b6);p1.add(b19);p1.add(b20);
		p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b21);p1.add(b22);
		p1.add(b10);p1.add(b11);p1.add(b12);p1.add(b23);p1.add(b24);
		p1.add(b13);p1.add(b14);p1.add(b15);p1.add(b25);p1.add(b26);
		
	

		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		c.add("North",t1);
		c.add("Center",p1);
		c.add("South",b16);
		
		
		this.setTitle("calculatrice");
		this.setSize(300,250);
		this.setResizable(false);
		this.show(); 
			
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);
b23.addActionListener(this);  	
  }
  
 public void actionPerformed(ActionEvent e)
 {
 	
 		float  s=0 ;
 	if(e.getSource()==b1)
 	{
 		t1.setText(	t1.getText()+"1");
 	}
 	if(e.getSource()==b2)
 	{
 		t1.setText(	t1.getText()+"2");
 	}
 		if(e.getSource()==b3)
 	{
 		t1.setText(	t1.getText()+"3");
 	}
 		if(e.getSource()==b4)
 	{
 		t1.setText(	t1.getText()+"4");
 	}
 		if(e.getSource()==b5)
 	{
 		t1.setText(	t1.getText()+"5");
 	}
 		if(e.getSource()==b6)
 	{
 		t1.setText(	t1.getText()+"6");
 	}
 		if(e.getSource()==b7)
 	{
 		t1.setText(	t1.getText()+"7");
 	}
 		if(e.getSource()==b8)
 	{
 		t1.setText(	t1.getText()+"8");
 	}
 		if(e.getSource()==b9)
 	{
 		t1.setText(	t1.getText()+"9");
 	}
 		if(e.getSource()==b10)
 	{
 		t1.setText(	t1.getText()+"0");
 	}


 	if(e.getSource()==b15)
 	{
 		t1.setText("0");
 	}
 	
 	//*
 	if(e.getSource()==b11)
 	{
 		aux=Float.parseFloat(""+t1.getText());
 		t1.setText("0");
 		op="mult";
 	}
 	///
 	if(e.getSource()==b12)
 	{
 			aux=Float.parseFloat(""+t1.getText());
 		t1.setText("0");
 	
 		op="sous";
 	}
 	//+
 	if(e.getSource()==b13)
 	{
 			aux=Float.parseFloat(""+t1.getText());
 		t1.setText("0");
 		op="divi";
 	}
 	//*/
 	if(e.getSource()==b14)
 	{
 			aux=Float.parseFloat(""+t1.getText());
 		t1.setText("0");
 		op="plus";
 	}
 	
 	

 	
 	
 	//==
 	if(e.getSource()==b16)
 	{
 		
 		if(op.equals("mult"))
 		{
 			res=Float.parseFloat(""+t1.getText())*aux;
 		}
 		if(op.equals("sous"))
 		{
 			res=aux-Float.parseFloat(""+t1.getText());
 		}
 		if(op.equals("divi"))
 		{
 			res=aux/Float.parseFloat(""+t1.getText());
 		}
 		if(op.equals("plus"))
 		{
 			res=Float.parseFloat(""+t1.getText())+aux;
 		}
 		
 		t1.setText(res+"");
 	
 	}
 	
 	
 	
 	
 	//X²
 		if(e.getSource()==b18)
 	{
 		float val=Float.parseFloat(""+t1.getText());
 		float puis=val*val;
 		t1.setText(puis+"");
 	}
 	
 	
 	//Sinus
 		if(e.getSource()==b17)
 	{
 		float val=Float.parseFloat(""+t1.getText());
 		double sin=Math.sin(val);
 		t1.setText(sin+"");
 	}
 		//cos
 		if(e.getSource()==b19)
 	{
 		float val=Float.parseFloat(""+t1.getText());
 		double cos=Math.cos(val);
 		t1.setText(cos+"");
 	}
 	
 	//tan
 		if(e.getSource()==b19)
 	{
 		float val=Float.parseFloat(""+t1.getText());
 		double tan=Math.tan()(val);
 		t1.setText(tan+"");
 	}
 
    	
 }
    



public static void main (String[] args) 
{ 	
 	calculatrice C =new calculatrice();
 
}    

    
}