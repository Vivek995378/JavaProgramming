import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="AWTChoiceControls" height=400 width=400>
</applet>
*/

public class AWTChoiceControls extends Applet implements ItemListener
{
	Choice os,browser;
	String msg="";

	public void init()
	{
		os= new Choice();
		browser= new Choice();

		os.add("Windows 98/XP");
		os.add("Windows NT/2000");
		os.add("Solaris");
		os.add("MacOS");
		//os.select("Solaris");

		browser.add("Netscape 3.x");
		browser.add("Netscape 4.x");
		browser.add("Netscape 5.x");
		browser.add("Netscape 6.x");

		browser.add("Internet Explorer 4.0");
		browser.add("Internet Explorer 5.0");
		browser.add("Internet Explorer 6.0");

		browser.add("Lynx 2.4");

		//browser.select("Netscape 4.x");

		add(os);
		add(browser);
		os.addItemListener(this);
		browser.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Current OS:";
		msg+=os.getSelectedItem();
		g.drawString(msg,6,120);
		msg="Current Browser:";
		msg+=browser.getSelectedItem();
		g.drawString(msg,6,140);
	}
}