public class TestButton1{
	public static void main(String[] args){
	TestButtonman tbm = new TestButton();
	
	}
}

class TestButtonMan implements ActionListener{
	JFrame frame;
	JButton button;

	public TestButtonMan() {
	
		frame = new JFrame("TestButton");
		frame.setLocation(400, 400);		
		frame.setSize(400, 400);			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Click Me!");

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(button);

		frame.setVisible(true);
	}
}