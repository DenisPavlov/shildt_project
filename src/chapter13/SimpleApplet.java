package chapter13;

import java.awt.*;
import java.applet.*;
/*
<applet code="chapter13.SimpleApplet" width=200 height=60>
</applet>
 */
public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Привет Денис", 20, 20);
    }
}