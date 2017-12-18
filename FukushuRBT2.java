import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FukushuRBT2 extends JFrame implements ActionListener{

	private JLabel label;
	private JRadioButton button;

	public void actionPerformed(ActionEvent e){

		Boolean result = this.button.isSelected();

		String msg = "";
		if(result){
			msg = this.button.getText()+"が選択されています";
			this.label.setText(msg);
		}
	}
		

	FukushuRBT2(String title){

		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.button = new JRadioButton("test");

		JButton jbtn = new JButton("click");
		jbtn.addActionListener(this);

		this.label = new JLabel("here is a label");

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,1));

		panel.add(button);
		panel.add(jbtn);
		panel.add(this.label);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		FukushuRBT2 frame = new FukushuRBT2("hello");
		frame.setVisible(true);
	}

	}
