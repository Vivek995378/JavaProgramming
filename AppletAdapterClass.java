import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="AppletAdapterClass" height=300 width=300>
</applet>
*/public class AppletAdapterClass extends Applet
{
	public void init()
	{
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseMotionAdapter(this));
	}
}
class MyMouseAdapter extends MouseAdapter
{
	AppletAdapterClass aac;
	public MyMouseAdapter(AppletAdapterClass aac)
	{
		this.aac=aac;
	}
	public void mouseClicked(MouseEvent me)
	{
		aac.showStatus("Mouse Clicked");
	}
}
class MyMouseMotionAdapter extends MouseMotionAdapter
{
	AppletAdapterClass aac;
	public MyMouseMotionAdapter(AppletAdapterClass aac)
	{
		this.aac=aac;
	}
	public void mouseDragged(MouseEvent me)
	{
		aac.showStatus("Mouse Dragged");
	}
}