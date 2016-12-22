import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameManS{
	 public static void main(String[] args) {
	 	FrameMan fm = new FrameMan();

	}
}

class FrameMan implements  ActionListener{

		JFrame frame;
		JPanel panel;
		JLabel label;
	//	ImageIcon icon;
		JButton button;
		int num=0;


		public FrameMan(){
			System.out.println("ALOHA2!");


			openWindow();
		}

		private void openWindow(){

			frame = new JFrame();

	
			frame.setLocation(200, 200);
			frame.setSize(300, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			//icon = new ImageIcon("Yang/1_Desktop_Icons/icon_256.png");

			panel = new JPanel();
			label = new JLabel("icon");
			button = new JButton("clickMe!");
			button.addActionListener(this);

			panel.add(label);
			panel.add(button);
			frame.add(panel);

			frame.setVisible(true);
		}
		public void actionPerformed(ActionEvent e){
			if(num%2==0){
			label.setText("HEELO");
		}else{
			label.setText("ALOHAHAHAH");
		}
		num++;
		}
	}


