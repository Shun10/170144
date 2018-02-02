import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FukushuCheckBox2 extends JFrame implements ActionListener{

		private JRadioButton[] radiobtn;
    	private JCheckBox[] check;
    	private JButton btn;
    	private JLabel lbl;

	//menu
	FukushuCheckBox2(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
		JMenu menu1 = new JMenu("File");
		JMenu menu2 = new JMenu("Edit");
		JMenu menu3 = new JMenu("Help");

		JMenuItem menuitem1 = new JMenuItem("new");
		JMenuItem menuitem2 = new JMenuItem("Open");
		JMenuItem menuitem3 = new JMenuItem("Close");

		JMenuItem menu2item1 = new JMenuItem("cut");
		JMenuItem menu2item2 = new JMenuItem("copy");
		JMenuItem menu2item3 = new JMenuItem("paste");

		JMenuItem menu3item1 = new JMenuItem("version");
		JMenuItem menu3item2 = new JMenuItem("index");

		setJMenuBar(menubar);
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);

		menu1.add(menuitem1);
		menu1.add(menuitem2);
		menu1.add(menuitem3);

		menu2.add(menu2item1);
		menu2.add(menu2item2);
		menu2.add(menu2item3);

		menu3.add(menu3item1);
		menu3.add(menu3item2);



//------------------------------------------------------
		//ここからcheckbox
		//radiobtn

		JPanel pnl = new JPanel();
		radiobtn = new JRadioButton[3];
		check = new JCheckBox[3];
		btn = new JButton("click");
		lbl = new JLabel("null");
		btn.addActionListener(this);

		pnl.setLayout(new GridLayout(3,3));

		check[0] = new JCheckBox("Mac");
		check[1] = new JCheckBox("Ma1");
		check[2] = new JCheckBox("Mac2");

		radiobtn[0] = new JRadioButton("Windows");
		radiobtn[1] = new JRadioButton("Windows1");
		radiobtn[2] = new JRadioButton("Windows2");

		ButtonGroup radioGroup = new ButtonGroup();
    	radioGroup.add(radiobtn[0]);
    	radioGroup.add(radiobtn[1]);
    	radioGroup.add(radiobtn[2]);

		pnl.add(check[0]);
		pnl.add(check[1]);
		pnl.add(check[2]);

		pnl.add(radiobtn[0]);
		pnl.add(radiobtn[1]);
		pnl.add(radiobtn[2]);

		pnl.add(btn);
		pnl.add(lbl);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);

	}

	public static void main(String[] args){
		FukushuCheckBox2 frame = new FukushuCheckBox2("HELLO");
		frame.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e){
    	String[] checkData = {"","",""};
    	for (int n=0; n<3 ; n++ ) {
    		if (this.check[n].isSelected()) {
    			checkData[n] = this.check[n].getText();
    	}
    }
    
    	for (int i=0; i<3; i++ ) {
    		if (this.radiobtn[i].isSelected()) {			
    			this.lbl.setText(checkData[0]+checkData[1]+checkData[2]+this.radiobtn[i].getText()+"です");
    			}
    	}
	}
}