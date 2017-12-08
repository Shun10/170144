import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Container;
import java.awt.BorderLayout;

class TestJPasswordField extends JFrame{
	public static void main(String[] args){

		TestJPasswordField frame = new TestJPasswordField("ALOHA");
		frame.setVisible(true);
		
	}

	TestJPasswordField(String title){
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();

		JPasswordField pass1 = new JPasswordField(20);

		pnl.add(pass1);

		Container cotentPane = getContentPane();
		cotentPane.add(pnl, BorderLayout.CENTER);
	}
}