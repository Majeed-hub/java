import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code=keyboardApplet width=500 height=700>
</applet>
*/

public class keyboardApplet extends Applet implements KeyListener
{
	String msg="";

	public void init()
	{
		addKeyListener(this);
		requestFocus();
	}

	public void keyPressed(KeyEvent k)
	{
				showStatus("KEY PRESSED");
		
	}

	public void keyReleased(KeyEvent k)
	{
		showStatus("KEY RELEASED");
	}

	public void keyTyped(KeyEvent k)
	{
		msg+=k.getKeyChar();
		repaint(0);
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,20,20);
	}
}