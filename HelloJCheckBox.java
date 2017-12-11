import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.Container;
import java.awt.BorderLayout;

public class HelloJCheckBox extends JFrame{
	HelloJCheckBox(String title)				{
		setTitle(title);
		setSize(500,500);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();

		JCheckBox check1 = new JCheckBox("Linux");
		JCheckBox check2 = new JCheckBox("macos");
		JCheckBox check3 = new JCheckBox("Android");

		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);

		Container cotentPane = getContentPane();
		cotentPane.add(pnl, BorderLayout.CENTER);
	}
		public static void main(String[]args){

		HelloJCheckBox frame = new HelloJCheckBox("aloha");
		frame.setVisible(true);
	}

}
