import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class LargeFrame extends JFrame{

	LargeFrame(String title){
		setTitle(title);
		setLocation(0,0);
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
	
		JTextField jtf = new JTextField("",20);
		JPasswordField jpf = new JPasswordField("ALOHA");
		pnl.add(jtf,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		TestGui tg = new TestGui("HELLO");
		tg.setVisible(true);
	}
}
