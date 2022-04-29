import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloSwing extends JFrame implements ActionListener
{
	//declare component variables
	private JPanel panel;
	private JButton button;
	private JLabel label;

	//declare and initialize other data members
	private String labelMessage = "Number of button clicks: ";
	private int numClicks = 0;

	public static void main(String[] args)
	{
		JFrame frame = new HelloSwing();
		frame.setPreferredSize(new Dimension(400,200));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

    // constructor
	HelloSwing()
	{
		super("Hello Swing");
		
		//create components
		button = new JButton("Click Me");
		label = new JLabel (labelMessage + "0");

		//Font(font name, 0-normal/1-bold/2-italics/3-bold and italics, font size)
		button.setFont(new Font("Times New Roman", 2, 24));
		label.setFont(new Font("Times New Roman", 3, 24));

		//create JPanel
		panel = new JPanel();

		//add components to JPanel
		panel.add(button);
		panel.add(label);

		//set JPanel to be the content pane
		setContentPane(panel);

		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button)
		{
			numClicks++;
			label.setText(labelMessage + numClicks);
		}
	}
}
