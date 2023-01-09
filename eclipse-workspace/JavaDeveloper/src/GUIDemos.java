import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class GUI extends JFrame implements ActionListener{
	
	JLabel l,l1,result;
	JTextField f;
	JButton b,b1;
	JPasswordField pass;
	
	public GUI(){
		
		//setLayout(new GridLayout());
		//JLabel l=new JLabel("Hello World");
		//add(l);
		//JLabel l1=new JLabel("Hi I'm Hrutik");
		//add(l1);
		
		 l=new JLabel("Username:");
		 l.setBounds(20,150, 200,50);  
		 l1=new JLabel("Password:");
		 l1.setBounds(100,75,100,30);   
		 f=new JTextField(20);
		 pass=new JPasswordField(10);
		 pass.setBounds(100,75,100,30);   
		 
		 b=new JButton("Submit");
		 b1=new JButton("Clear");
		 result=new JLabel();
		add(l);
		add(l1);
		add(f);
		add(pass);
		add(b);
		add(b1);
		add(result);
		
		//Hyper Link Label
		//JLabel hyperlink = new JLabel("Visit CodeJava");
		//hyperlink.setForeground(Color.BLUE.darker());
		//add(hyperlink);
		//It will convert cursor to hand cursor
		//hyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		//It will work when you close then GUI it will stop console exit the from class
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//getSource method check which method has clicked
		if(e.getSource()==b) {
			if(f.getText().equals("hrutik") && pass.getText().equals("1234")) {
				result.setText("Login Successful");
			}else if(f.getText().equals("") && pass.getText().equals("")) {
				result.setText("Empty fields not allowed");
			}
			else {
				result.setText("Login Un-successful");
			}
		}else {
			f.setText("");
			pass.setText("");
		}
	}
}


public class GUIDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI g=new GUI();
	}

}
