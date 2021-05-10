import java.awt.*;
import java.applet.*;

/*
<applet code="AWTLable" height=30 width=300>
</applet>
*/
public class AWTLable extends Applet
{
	public void init()
	{
		Label one = new Label("One");
		Label two = new Label("Two");
		Label three = new Label("Three");
		add(one);
		add(two);
		add(three);
	}
}