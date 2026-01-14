package swing;

import javax.swing.*;
import java.awt.*;

public class JavaSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Орис");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1000, 1000);

        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Текстовое поле");

        JButton button = new JButton("Какая-то кнопка");

        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}
