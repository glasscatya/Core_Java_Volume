package innerClass;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

import javax.swing.*;


public class InnerClassTest
{
    public static void main(String[] args)
    {
        var clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "1111");
        System.exit(0);
    }
}

class TalkingClock
{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep)
    {
        this.beep = beep;
        this.interval = interval;
    }

    public void start()
    {
        var listener = this.new TimerPrinter();
        var timer = new Timer(interval, listener);
        //timer 是一个事件监听器，每1s就会触发一次listener
        timer.start();
    }

    public class TimerPrinter implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("the time is "
            + Instant.ofEpochMilli(e.getWhen()));
            if(TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}