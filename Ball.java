
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Ball extends JPanel implements Runnable
{
	int dx = 3, dy = 3;
	Color col = Color.RED;
	int line_w = 1;
	int rad = 30;

	public Ball(int x, int y)
	{
		setBounds(x-rad/2, y-rad/2, rad, rad);
		Thread tt = new Thread(this);
		tt.start();	//«апуск потока
	}

	@Override
	public void paint(Graphics g) 
	{
		Graphics2D MyGraph = (Graphics2D)g;
		MyGraph.setColor(col); //// ”станавливаем цвет шара
		MyGraph.setStroke(new BasicStroke(line_w, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
		MyGraph.fillOval(0, 0, this.getWidth()-2, this.getHeight()-1);
	}


	public void move()
	{
		JPanel parent = (JPanel) this.getParent();
		if(getX() < 0 || getX() + rad > parent.getWidth()) // ударение м€ча лево, право
		{
			dx = -dx; // изменить знак компонента x вектора скорости м€ча
		}
		if(getY() < 0 || getY() + rad > parent.getHeight()) // ударение м€ча верх, низ
		{
			dy = -dy; 
		}
		this.move(getX() + dx, getY() + dy);
	}

	@Override
	public void run() 
	{
		try 
		{
			Thread.sleep(100);
			while(true)
			{
				move();
				Thread.sleep(10);
			}
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
