import java.applet.*;
import java.awt.*;
/*
<applet code="AppletDrawingArcs" height=300 width=300>
</applet>
*/
public class AppletDrawingArcs extends Applet{
	public void paint(Graphics g)
	{
		g.drawArc(10,40,70,70,0,75);
		g.fillArc(100,40,70,70,20,75);
		
		
		
	}
}