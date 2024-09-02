import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("DemoJavaDesktop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JButton button1 = new JButton("Click Me");
        JButton button2 = new JButton("Click Me");
        JButton button3 = new JButton("Click Me");
        JButton button4 = new JButton("Click Me");
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);

        JLabel label = new JLabel("Welcome to Java Desktop");
        frame.add(label, BorderLayout.CENTER);


        frame.setVisible(true);
    }
}