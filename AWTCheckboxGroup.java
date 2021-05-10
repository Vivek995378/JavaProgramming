import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="AWTCheckboxGroup" width=300 height=300>
</applet>
*/
public class AWTCheckboxGroup extends Applet implements ItemListener
{
	String msg="";
	Checkbox c1,c2,c3,c4;
	CheckboxGroup cbg;

	public void init()
	{
		cbg=new CheckboxGroup();
		c1=new Checkbox("Java",false,cbg);
		c2=new Checkbox("C++",false,cbg);
		c3=new Checkbox("Html",false,cbg);
		c4=new Checkbox("Ruby",false,cbg);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);

		add(c1);
		add(c2);
		add(c3);
		add(c4);

	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Current Selection :";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,6,100);
	}
}