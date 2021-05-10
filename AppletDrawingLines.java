import java.applet.*;
import java.awt.*;
/*
<applet code="AppletDrawingLines" height=300 width=300>
</applet>
*/
public class AppletDrawingLines extends Applet{
	public void paint(Graphics g)
	{
		g.drawLine(0,0,100,100);
		g.drawLine(0,100,100,0);
		g.drawLine(40,25,250,180);
	}
}