import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hello3JCheckBox extends JFrame implements ActionListener{
	//data
	JLabel label;
	JCheckBox check1;
	//method
	public void actionPerformed(ActionEvent e){
		this.label.setText("click");
	}

	Hello3JCheckBox(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(3,1));
		//JPanel
		JCheckBox check1 = new JCheckBox("Linux");
		JCheckBox check2 = new JCheckBox("macos");
		JCheckBox check3 = new JCheckBox("Android");

		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		//JButoon
		JButton btn = new JButton("check");
		btn.addActionListener(this);
		pnl.setLayout(new GridLayout(4,1));
		pnl.add(btn);

		//JLabel
		this.label = new JLabel("aloha");
		pnl.setLayout(new GridLayout(5,1));
		pnl.add(label);

		Container cotentPane = getContentPane();
		cotentPane.add(pnl, BorderLayout.CENTER);
	}


		public static void main(String[]args){
		Hello3JCheckBox frame = new Hello3JCheckBox("aloha");
		frame.setVisible(true);
	}

}
