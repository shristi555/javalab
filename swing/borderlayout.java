import javax.swing.*;
import java.awt.*;

class BorderEg {
    public static void main(String[] args) {
        JFrame body = new JFrame("Kotlin is way short than Java");

        body.setLayout(new BorderLayout());

        body.add(new JButton("North"), BorderLayout.NORTH);
        body.add(new JButton("South"), BorderLayout.SOUTH);
        body.add(new JButton("East"), BorderLayout.EAST);
        body.add(new JButton("West"), BorderLayout.WEST);
        body.add(new JButton("Center"), BorderLayout.CENTER);

        body.setSize(400, 300);
        body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        body.setVisible(true);
    }
}