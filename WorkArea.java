

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class WorkArea extends JPanel implements MouseListener
{
	public WorkArea()
	{
		setLayout(null);
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		Ball ball = new Ball(e.getX(), e.getY());// ��� ����� ������ ������� ������ ����
		add(ball);
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e){}	
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}
