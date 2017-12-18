import javax.swing.*;
import java.awt.*;

public class FukushuCheckBox extends JFrame{
	public static void main(String[] args){
		FukushuCheckBox frame = new FukushuCheckBox("hello");
		frame.setVisible(true);
	}

	FukushuCheckBox(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();

		JCheckBox check1 = new JCheckBox("apple");
		JCheckBox check2 = new JCheckBox("orange");

		pnl.add(check1);
		pnl.add(check2);

		Container contentPane = getContentPane();
		contentPane.add(pnl,BorderLayout.CENTER);

	}
}