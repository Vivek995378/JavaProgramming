import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="AWTTextField" height=400 width=400>
</applet>
*/

public class AWTTextField extends Applet implements ActionListener
{
	TextField name,pass;
	public void init()
	{
		Label nameP=new Label("Name: ",Label.RIGHT);
		Label passP=new Label("Password: ",Label.RIGHT);
		name= new TextField(12);
		pass= new TextField(8);
		pass.setEchoChar('a');

		add(nameP);
		add(name);
		add(passP);
		add(pass);

		name.addActionListener(this);
		pass.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Name: "+ name.getText(),6,60);
		g.drawString("Selected text in name: "+ name.getSelectedText(),6,80);
		g.drawString("Password: "+pass.getText(),6,100);
	}
}