/*
<Applet code=AppletBanner Height="400" Width="400">
</Applet>
*/
import java.awt.*;
import java.applet.*;

public class AppletBanner extends Applet implements Runnable
{
	String msg="A Simple Moving Banner";
	Thread t = null;
	boolean stopFlag;
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void start()
	{
		t= new Thread(this);
		stopFlag = false;
		t.start();
	}
	public void run()
	{
		char ch;
		//while(stopFlag==false)
		for( ; ; )
		{
			try
			{
				repaint();
				t.sleep(250);
				ch=msg.charAt(0);
				msg=msg.substring(1,msg.length());
				msg+=ch;
				if(stopFlag==true)
				{
					break;
				}
			}catch(Exception e){}
		}
	}
	public void stop()
	{
		stopFlag = true;
		//t=null;
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,30);
		showStatus("This is the status window.....");
	}
}