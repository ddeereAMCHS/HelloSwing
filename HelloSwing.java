import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloSwing extends JFrame implements ActionListener
{
	//declare component variables
	private JPanel panel;
	private JButton button;
	private JLabel label;
	private JButton button2;
	private JLabel label2;
	private JButton button3;

	//declare and initialize other data members
	private String labelMessage = "Counter: ";
	private int numClicks = 0;
	private String labelMessage2 = "";

	public static void main(String[] args)
	{
		JFrame frame = new HelloSwing();
		frame.setPreferredSize(new Dimension(400,200));
		frame.pack();
		frame.setVisible(true);
	}

    // constructor
	HelloSwing()
	{
		super("Hello Swing");
		
		//create components
		button = new JButton("Increment");
		label = new JLabel (labelMessage + "0");
		button2 = new JButton("Decrement");
		label2 = new JLabel ("ON");
		button3 = new JButton("Toggle");

		//Font(font name, 0-normal/1-bold/2-italics/3-bold and italics, font size)
		button.setFont(new Font("Times New Roman", 2, 24));
		label.setFont(new Font("Times New Roman", 3, 24));

		//create JPanel
		panel = new JPanel();

		//add components to JPanel
		panel.add(button);
		panel.add(label);
		panel.add(button2);
		panel.add(label2);
		panel.add(button3);

		//set JPanel to be the content pane
		setContentPane(panel);

		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button)
		{
			numClicks++;
			label.setText(labelMessage + numClicks);
		}
		if(e.getSource() == button2)
		{
			numClicks--;
			label.setText(labelMessage + numClicks);
		}
		if(e.getSource() == button3)
		{
			if(label2.getText().equals("ON"))
			{
				label2.setText(labelMessage2 + "OFF");
			}
			else
			{
				label2.setText(labelMessage2 + "ON");
			}
		}
	}
}
