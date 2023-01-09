import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

class GUI2 extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l5;
	JTextArea a,l4;
	JButton b;
	JRadioButton b1,b2,b3;
	JCheckBox c1,c2,c3;
	JComboBox cm1;
	
	public GUI2() {
		l1=new JLabel("count word");
		l1.setBounds(50,25,100,30); 
		l2=new JLabel("count char");
		l2.setBounds(160,25,100,30);  
		a=new JTextArea("Text Area",10,15);
		l3=new JLabel("Programms");
		l4=new JTextArea("Language");
		c1=new JCheckBox("English");
		c2=new JCheckBox("Kannada");
		c3=new JCheckBox("Hindi");
		l5=new JLabel("Lang");
		
		String code[]= {"C","Java","C#","Python"};
		
		cm1=new JComboBox(code);
		cm1.setBounds(50, 50,90,20);
		
		b=new JButton("Submit");
		b1=new JRadioButton("Java");
		b2=new JRadioButton("C#");
		b3=new JRadioButton("Python");
		ButtonGroup grp=new ButtonGroup();
		grp.add(b1);
		grp.add(b2);
		grp.add(b3);
		
		
		add(l1);add(l2);add(a);add(b);add(b1);add(b2);add(b3);add(l3);add(c1);add(c2);add(c3);add(l4);
		add(cm1);add(l5);
		a.setText("In this Java Swing tutorial, you will learn how to create a hyperlink by extending "
				+ "the JLabel component, "
				+ "as Swing doesn’t have any built-in"
				+ " components that can display hyperlinks.");
		b.addActionListener(this);
		
		//String name=JOptionPane.showInputDialog("Enter Name"); 
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		//It will work when you close then GUI it will stop console exit the from class
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text=a.getText();
		String word[]=text.split(" ");
		l1.setText("words are:"+Integer.toString(word.length));
		l2.setText("char are:"+Integer.toString(text.length()));
		//l2.setText(text.length());
		//String result="";
		if(b1.isSelected()) {
			l3.setText("Java Selected");
		}else if(b2.isSelected()) {
			l3.setText("C# Selected");
		}else {
			l3.setText("Python Selected");
		}
		
		if(c1.isSelected()) {
			l4.setText("English");
		}
		if(c2.isSelected()) {
			l4.setText("Kannada");
		}if(c3.isSelected()) {
			l4.setText("Hindi");
		}
		 JOptionPane.showMessageDialog(this,l4);  
		 
		String data="Program selected: "+cm1.getItemAt(cm1.getSelectedIndex());
		l5.setText(data);
	}
}
public class GUIDemo2 {
	public static void main(String args[]) {
		GUI2 g=new GUI2();
	}
}
