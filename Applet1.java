import java.awt.*;
import java.applet.*;

/*
<applet code="Applet1" width=300  height=50>
</applet>
*/

public class Applet1 extends Applet
{
	String msg;
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg = "Inside init() --";
	}
	public void start()
	{
		msg += "Inside start() --";
	}
	public void paint(Graphics g)
	{
		msg += "Inside paint().";
		g.drawString(msg,10,30);
	}
}