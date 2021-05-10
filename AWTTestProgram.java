import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="AWTTestProgram" height=400 width=400>
</applet>
*/

public class AWTTestProgram extends Applet implements ActionListener
{
	TextField name;
	Label nameP;
	Checkbox male,female;
	CheckboxGroup cbg;
	Button ok;
	String msg="";
	public void init()
	{
		nameP=new Label("Name: ",Label.CENTER);
		name=new TextField(20);

		cbg=new CheckboxGroup();
		male= new Checkbox("Male ",false,cbg);
		female=new Checkbox("Female ",false,cbg);

		ok=new Button("OK");
		ok.addActionListener(this);

		add(nameP);
		add(name);
		add(male);
		add(female);
		add(ok);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Hi ";
		String s=cbg.getSelectedCheckbox().getLabel();
		if(s.equals("Male "))
			msg+="Mr. " + name.getText();
		else 
			msg+="Mrs. " + name.getText();
		g.drawString(msg,6,100);
	}
}