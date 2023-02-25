import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code=comboApplet width=500 height=700>
</applet>
*/

public class comboApplet extends Applet implements ItemListener

{
    Label l1;
    Choice c1;

    public void init()
    {
           l1=new Label ("Select colour ");
           c1=new Choice();

            c1.add("Black");
            c1.add("Blue");
            c1.add("Red");
            c1.add("Green");
           c1.add ("White");
           c1.add("Cyan");
            add(l1);
            add(c1);
             c1.addItemListener(this);
    }
 public void paint(Graphics g)
{
}
         
public void itemStateChanged(ItemEvent ie)
{   String cs=c1.getSelectedItem();

    if (cs.equals("Red"))
       setBackground(Color.red);
    else if (cs.equals("Blue"))
       setBackground(Color.blue);
    else if (cs.equals("Green"))
       setBackground(Color.green);
    else if (cs.equals("White"))
       setBackground(Color.white);
     else if (cs.equals("Black"))
        setBackground(Color.black);
    else if (cs.equals("Cyan"))
       setBackground(Color.cyan);
       
repaint();
}

}