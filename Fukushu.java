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

public class Fukushu extends JFrame implements ActionListener{
	private JLabel label;
	private JCheckBox checkbox;

	public static void main(String[] args){
		Fukushu frame = new Fukushu("aloha");
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if(this.checkbox.isSelected()){
			this.label.setText(this.checkbox.getText()+"が選択されています。");
		}else{
			this.label.setText("");
		}
	}

	Fukushu(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.label = new JLabel("Fukushu");
		this.checkbox = new JCheckBox("Linux");

		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();

		JButton btn = new JButton("click");

		btn.addActionListener(this);

		pnl1.add(this.checkbox);
		pnl1.add(this.label);
		pnl2.add(btn);

		Container cotentPane = getContentPane();
		cotentPane.add(pnl1,BorderLayout.CENTER);
		cotentPane.add(pnl2,BorderLayout.CENTER);

	}
}