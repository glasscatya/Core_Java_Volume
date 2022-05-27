package anonymousInnerClass;

import java.awt.*;
import java.awt.event.*;
import java.time.*;

import javax.swing.*;


public class AnonymousInnerClass {
    public static void main(String[] args) {
        var clock = new TalkingClock();
        System.out.println(1);
        clock.start(1000, true);
//        System.out.println(3);
        JOptionPane.showMessageDialog(null, "111");
        System.exit(0);
    }
}

class TalkingClock
{
    public void start(int interval, boolean beep)
    {
        var listener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println(2);
                System.out.println("the time is " + Instant.ofEpochMilli(e.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        var timer = new Timer(interval, listener);
        timer.start();
    }
}