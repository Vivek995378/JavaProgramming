import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="AppletAllKeyboardEvents" height=300 width=300>
</applet>
*/
public class AppletAllKeyboardEvents extends Applet implements KeyListener
{
	String msg = "";
	int x=10,y=20;
	public void init()
	{
		addKeyListener(this);
		requestFocus();
	}
	public void keyPressed(KeyEvent ke)
	{
		showStatus("Key Down");
		int key = ke.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_F1:
							msg+="<F1>";
							break;
			case KeyEvent.VK_F2:
							msg+="<F2>";
							break;
			case KeyEvent.VK_F3:
							msg+="<F3>";
							break;
			case KeyEvent.VK_PAGE_DOWN:
							msg+="<PgDn>";
							break;
			case KeyEvent.VK_PAGE_UP:
							msg+="<PgUP>";
							break;
			case KeyEvent.VK_LEFT:
							msg+="<Left Arrow>";
							break;
			case KeyEvent.VK_RIGHT:
							msg+="<Right Arrow>";
							break;
		}
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Up ");
	}
	public void keyTyped(KeyEvent ke)
	{
		msg+=ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}

}