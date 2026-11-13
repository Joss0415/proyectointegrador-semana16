package semana16.swing;

import javax.swing.*;
import java.awt.*;

public class Disenos {
    public static void main(String[] args) {
        JFrame f = new JFrame("FlowLayout");
        f.setLayout(new FlowLayout());
        for (String t : new String[] {
                "Uno", "Dos", "Tres", "Cuatro", "Cinco" }) {
            f.add(new JButton(t));
        }


        f.setSize(300, 120);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
