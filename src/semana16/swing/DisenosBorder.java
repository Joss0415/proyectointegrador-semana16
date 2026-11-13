package semana16.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class DisenosBorder {
    public static void main(String[] args) {
        JFrame f = new JFrame("BorderLayout");
        f.setLayout(new BorderLayout());
        f.add(new JButton("NORTH"), BorderLayout.NORTH);
        f.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        f.add(new JButton("WEST"), BorderLayout.WEST);
        f.add(new JButton("EAST"), BorderLayout.EAST);
        f.add(new JButton("CENTER"), BorderLayout.CENTER);
        f.setSize(320, 180);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
