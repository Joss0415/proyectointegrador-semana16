package semana16.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class DisenosGrid {
    public static void main(String[] args) {
        JFrame f = new JFrame("GridLayout");
        f.setLayout(new GridLayout(2, 3, 5, 5));
        for (int i = 1; i <= 6; i++) {
            f.add(new JButton("Celda " + i));
        }
        f.setSize(320, 140);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
