import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="AWTButton" height=300 width=300>
</applet>
*/
public class AWTButton extends Applet implements ActionListener
{
	String msg="";
	Button yes,no,maybe;
	public void init()
	{
		yes=new Button("Yes");
		no=new Button("No");
		maybe=new  Button("Undecided");
		add(yes);
		add(no);
		add(maybe);
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Yes"))
		{
			msg="You pressed yes";
		}
		else if(str.equals("No"))
		{
			msg="You pressed no";
		}
		else
		{
			msg="You pressed undecided";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,6,100);
	}
}