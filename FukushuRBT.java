import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FukushuRBT extends JFrame implements ActionListener{

	private JLabel lbl;
	private JRadioButton rbtn1;
	private JRadioButton rbtn2;
	private JRadioButton rbtn3;

	public void actionPerformed(ActionEvent e){

		Boolean kekka1 = this.rbtn1.isSelected();
		Boolean kekka2 = this.rbtn2.isSelected();
		Boolean kekka3 = this.rbtn3.isSelected();

		String msg = "";
		if(kekka1){
			msg = this.rbtn1.getText()+"が選択されています";
			this.lbl.setText(msg);
		}
			if(kekka2){
				msg = this.rbtn2.getText()+"が選択されています";
				this.lbl.setText(msg);
			}
				if(kekka3){
					msg = this.rbtn3.getText()+"が選択されています";
					this.lbl.setText(msg);			
				}
			}
		

	FukushuRBT(String title){

		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.rbtn1 = new JRadioButton("test");
		this.rbtn2 = new JRadioButton("test2");
		this.rbtn3 = new JRadioButton("test3");

		JButton btn = new JButton("click");
		btn.addActionListener(this);

		this.lbl = new JLabel("here is a label");

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(5,1));

		pnl.add(rbtn1);
		pnl.add(rbtn2);
		pnl.add(rbtn3);
		pnl.add(btn);
		pnl.add(this.lbl);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		FukushuRBT frame = new FukushuRBT("aloha");
		frame.setVisible(true);
	}

	}
