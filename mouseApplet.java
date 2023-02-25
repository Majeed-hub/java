import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code=mouseApplet width=500 height=700>
</applet>
*/

public class mouseApplet extends Applet implements MouseListener,MouseMotionListener

    {	String msg = " " ;
	

	public void init()
	{	addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked (MouseEvent me)
	{
		msg="Mouse Clicked";
		repaint();
	}
	public void mouseEntered (MouseEvent me)
	{
		
		msg="Mouse Entered";
		repaint();
	}
	public void mouseExited (MouseEvent me)
	{
		
		msg="Mouse Exited";
		repaint();
	}


public void mousePressed(MouseEvent me)

{
	
	msg="mouse pressed";
	repaint();
}
public void mouseReleased(MouseEvent me)
{
	msg="mouse released";
	repaint();
}
public void mouseDragged(MouseEvent me)
{
	
	msg="mouse draged";
	
	repaint();
}
public void mouseMoved(MouseEvent me)
{
	msg="mouse moved";
        repaint();
}
public void paint (Graphics g)

{	
g.drawString(msg, 20,20);

}
}