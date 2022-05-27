package timer;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.util.Date;
import java.util.function.IntConsumer;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class LambdaTest {
    public static void main(String[] args) {
//        var timer = new Timer(1000, event ->
//                System.out.println("The time is " + new Date()));
//        timer.start();
//        ActionListener listener = event -> {
//            System.out.println(1);
//        };
////        System.out.println("listener = " + listener);
//        new Timer(1000,listener).start();
//
//        var re = new RepeatedGreeter();
//        re.greet();
//        JOptionPane.showMessageDialog(null, "Quit program");
//        System.exit(0);

        repeat(100, i -> System.out.println(i));
    }

    public static void repeat(int n, IntConsumer action) {
        for(int i = 0; i < n; i++) action.accept(i);
    }
}

class Greeter {
    public void greet(ActionEvent e) {
        System.out.println("Hi, the time is "
        + Instant.ofEpochMilli(e.getWhen()));
    }
}

class RepeatedGreeter extends Greeter {
    public void greet() {
        var timer = new Timer(1000, super::greet);
        timer.start();
    }
}


