
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;


public class Frame extends JFrame
{
	public Frame()
	{
		this.setBounds(400, 100, 600, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add( new WorkArea() );
	
		this.setVisible(true);
	}
}
