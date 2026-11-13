package semana16.ejercicios;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class Bienvenida extends JFrame {
    public Bienvenida() {
        super("Bienvenida");
        setLayout(new BorderLayout());

        JLabel etiqueta = new JLabel("Bienvenido al cajero", SwingConstants.CENTER);

        etiqueta.setFont(new Font("SansSerif", Font.BOLD, 22));
        etiqueta.setForeground(new Color(0x0B, 0x3D, 0x6E));

        add(etiqueta, BorderLayout.CENTER);

        getContentPane().setBackground(new Color(0xFC, 0xE9, 0xBF));

        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Bienvenida().setVisible(true);
    }
}
