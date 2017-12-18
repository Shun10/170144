import javax.swing.*;
import java.awt.*;

public class FukushuMenu extends JFrame{

	FukushuMenu(String title){
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
	}

	public static void main(String[] args){
		FukushuMenu frame = new FukushuMenu("HELLO");
		frame.setVisible(true);	
	}

}