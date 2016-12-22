import java.awt.*;
import javax.swing.*;

public class MainFrameManT{
	 public static void main(String[] args) {
	 	FrameMan fm = new FrameMan();

	}
}

class FrameMan {

		JFrame frame;
		JPanel panel;
		JLabel label;
		ImageIcon icon;

		public FrameMan(){
			System.out.println("ALOHA2!");


			openWindow();
		}

		private void openWindow(){

			frame = new JFrame();

	
			frame.setLocation(200, 200);
			frame.setSize(300, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			icon = new ImageIcon("Yang/1_Desktop_Icons/icon_256.png");

			panel = new JPanel();
			label = new JLabel(icon);


			panel.add(label);
			frame.add(panel);

			frame.setVisible(true);
		}
	}


