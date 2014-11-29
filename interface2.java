/**
 * @(#)interface2.java
 *
 *
 * @author 
 * @version 1.00 2014/3/19
 */
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class interface2 extends JFrame implements ActionListener

 {
    JLabel l1= new JLabel("Nom");
	JLabel l2= new JLabel("cin");
	 JLabel l3= new JLabel("Sex");
	  JLabel l4= new JLabel("Nationalite");
	  
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
	
	JRadioButton r1=new JRadioButton("homme");
	JRadioButton r2=new JRadioButton("femme");
		
	JCheckBox c1=new JCheckBox("Tunisien")	;
	JCheckBox c2=new JCheckBox("autre")	;
	
	
	JButton b1=new JButton("Valider") ;
    JButton b2=new JButton("Anuler") ;
    
    ButtonGroup bg=new ButtonGroup();
    
    public  interface2()
    {  	
    	
    	
    	bg.add(r1);
    	bg.add(r2);
    	r1.setSelected(true);
    	
    	JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(1,2));
		p2.add(r1);
		p2.add(r2);	


		JPanel p3=new JPanel();
		p3.setLayout(new GridLayout(1,2));
		p3.add(c1);
	    p3.add(c2);

		Container p1=getContentPane();
		p1.setLayout(new GridLayout(5,2));
		p1.add(l1);	p1.add(t1);
		p1.add(l2);	p1.add(t2);
		p1.add(l3);	p1.add(p2);
		p1.add(l4);	p1.add(p3);
		p1.add(b1);	p1.add(b2);
		
		
		this.setTitle("prog");
		this.setSize(500,150);
		this.show(); 
			
		b1.addActionListener(this);
    	
    	
    }
    
    
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b1)
    	{
    		ecrire();
    	}
    }
    
    
    
    
    
	void ecrire()
	{
	String nat="";
	if(c1.isSelected()==true)
	nat=nat+"/Tunisine";
	
	if(c2.isSelected()==true)
	nat=nat+"/autre";
	
	
	String sx="";
	if(r1.isSelected()==true)
	sx="homme";
	else
	sx="femme";


	try
	{
		BufferedWriter bf=new BufferedWriter (new FileWriter ("D:/user.txt", true));
		
       bf.write("Nom:\t"+t1.getText());
		bf.newLine();
		bf.write("cin:\t"+t2.getText());	
			
		bf.newLine();
		bf.write("sex:\t"+sx);
	
			
			
				
		bf.newLine();
		bf.write("Nationalite:\t"+nat);
		bf.newLine();
		bf.write("____________________________");	
		bf.newLine();		
		bf.close();
		
		
		

		
		
		
		
		JOptionPane.showMessageDialog(null,"Insertion effectué avec succée","Information",JOptionPane.INFORMATION_MESSAGE);
		
	}
	catch(Exception e) {}	
}
	
    
    public static void main (String[] args) 
{ 	
 	interface2 f =new interface2();
 
}    

    
}