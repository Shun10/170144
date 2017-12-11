import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Hello2JCheckBox extends JFrame{
	Hello2JCheckBox(String title)				{
		setTitle(title);
		setSize(500,500);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(3,1));

		JCheckBox check1 = new JCheckBox("Linux",true);
		JCheckBox check2 = new JCheckBox("macos");
		JCheckBox check3 = new JCheckBox("Android");

		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);

		Container cotentPane = getContentPane();
		cotentPane.add(pnl, BorderLayout.CENTER);
	}
		public static void main(String[]args){

		Hello2JCheckBox frame = new Hello2JCheckBox("aloha");
		frame.setVisible(true);
	}

}
