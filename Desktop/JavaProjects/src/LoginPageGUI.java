import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class LoginPage extends JFrame implements ActionListener,MouseListener{
	JLabel l1,l2,l3,hyperlink;
	JButton b1,b2;
	JTextField t1;
	JPasswordField p1;
	String text="";
	
	public LoginPage() {
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		t1=new JTextField(10);
		p1=new JPasswordField(10);
		b1=new JButton("Submit");
		b2=new JButton("Clear");
		l3=new JLabel("result");
		Panel panel=new Panel();  
        panel.setBounds(20,10,300,300);    
        panel.setBackground(Color.gray);  
		hyperlink = new JLabel("Click here");
		hyperlink.setForeground(Color.BLUE.darker());
		hyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		l1.setBounds(30, 50, 100, 30);    
	    l2.setBounds(30, 80, 100, 30);
	    t1.setBounds(150, 53, 100, 20);
	    l3.setBounds(100, 153, 150, 40);
	    p1.setBounds(150, 83, 100, 20);
		b1.setBounds(30, 120,90,20);
		b1.setBackground(Color.pink);
		b1.setForeground(Color.white);
		b2.setBounds(150, 120,90,20);
		b2.setBackground(Color.pink);
		b2.setForeground(Color.white);
		hyperlink.setBounds(150, 170,60,40);
	    
		b1.addActionListener(this);
		b2.addActionListener(this);
		hyperlink.addMouseListener(this);
		
		setTitle("Login page");
		add(l1);add(l2);add(t1);add(p1);add(b1);add(b2);add(l3);add(hyperlink);add(panel);
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		//It will work when you close then GUI it will stop console exit the from class
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			if(t1.getText().equals("hrutik") && p1.getText().equals("1234")) {
				l3.setText("Login Successful");
			}else if(t1.getText().equals("") && p1.getText().equals("")) {
				l3.setText("Empty fields not allowed");
			}
			else {
				l3.setText("Login Un-successful");
			}
		}else{
			t1.setText("");
			p1.setText("");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	        try {
				Desktop.getDesktop().browse(new URI("RegistationGUI.java"));
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("RegistationGUI not exits");
			}
	          
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//hyperlink.setText("<html><a href=''>" + text + "</a></html>");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		 //hyperlink.setText(text);
	}
}

public class LoginPageGUI 
{
	public static void main(String args[]) {
		LoginPage l=new LoginPage();
	}
}