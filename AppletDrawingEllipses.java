import java.applet.*;
import java.awt.*;
/*
<applet code="AppletDrawingEllipses" height=300 width=300>
</applet>
*/
public class AppletDrawingEllipses extends Applet{
	public void paint(Graphics g)
	{
		g.drawOval(10,10,50,50);
		g.fillOval(100,10,70,50);
		
		
	}
}