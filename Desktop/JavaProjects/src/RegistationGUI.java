import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Registation extends JFrame{
	JLabel l1,l2,l3,hyperlink;
	JButton b1,b2;
	JTextField t1;
	JPasswordField p1;
	public Registation() {
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		t1=new JTextField(10);
		p1=new JPasswordField(10);
		b1=new JButton("Submit");
		b2=new JButton("Clear");
		l3=new JLabel("result");
		
		l1.setBounds(30, 50, 100, 30);    
	    l2.setBounds(30, 80, 100, 30);
	    t1.setBounds(150, 53, 100, 20);
	    l3.setBounds(100, 153, 150, 40);
	    p1.setBounds(150, 83, 100, 20);
		b1.setBounds(30, 120,90,20);
		b2.setBounds(150, 120,90,20);
		
		add(l1);add(l2);add(t1);add(p1);add(b1);add(b2);add(l3);
		
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		//It will work when you close then GUI it will stop console exit the from class
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class RegistationGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registation reg=new Registation();
	}

}
