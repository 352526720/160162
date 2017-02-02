import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class TestIcon2 {
	public static void main(String[] args) {
		TestIcon win = new TestIcon();
	}
}

class TestIcon implements ActionListener{
	JFrame frame;
	ImageIcon img;
	ImageIcon img2;
	JPanel panel;
	JPanel panel1;
	JLabel label;
	JButton button;
	int num = 0;

	public TestIcon() {
		frame = new JFrame("160162");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		img = new ImageIcon("Ni_icons/1_Desktop_Icons/icon_016.png");
		img2 = new ImageIcon("Ni_icons/1_Desktop_Icons/icon_128.png");
		panel = new JPanel();
		panel1 = new JPanel();
		label = new JLabel(img);
		button = new JButton("次");
		button.addActionListener(this);

		Container con= frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		panel.add(label);
		panel1.add(button);	
		con.add(panel);
		con.add(panel1);
		

		
		frame.setVisible(true);
	}



	public void actionPerformed(ActionEvent ae) {
		if(num%2==0){
			label.setIcon(img2);
		} else {
			label.setIcon(img);
		}
		num++;
	}
}