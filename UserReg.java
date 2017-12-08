import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class UserReg extends JFrame{
	public static void main(String[] args){

		UserReg frame = new UserReg("ALOHA");
		frame.setVisible(true);
		
	}

	UserReg(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(2, 2));

		JLabel label1 = new JLabel("mail");
		JTextField mail = new JTextField("",20);
		JLabel label2 = new JLabel("password");
		JPasswordField password = new JPasswordField("",20);

		pnl.add(mail,BorderLayout.NORTH);
		pnl.add(password,BorderLayout.NORTH);
		pnl.add(label1,BorderLayout.NORTH);
		pnl.add(label2,BorderLayout.NORTH);

		Container cotentPane = getContentPane();
		cotentPane.add(pnl, BorderLayout.NORTH);
	}
}