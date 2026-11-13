package semana16.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DisenosAbsoluto {

    public static void main(String[] args) {

        JFrame f = new JFrame("Diseño Absoluto");
        f.setLayout(null);
        JLabel lbl = new JLabel("Monto:");
        lbl.setBounds(20, 20, 60, 25);
        JTextField txt = new JTextField();
        txt.setBounds(90, 20, 150, 25);
        JButton btn = new JButton("Aceptar");
        btn.setBounds(90, 60, 150, 30);
        f.add(lbl); f.add(txt); f.add(btn);
        f.setSize(290, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}


