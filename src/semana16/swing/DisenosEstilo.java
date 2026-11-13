package semana16.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;

public class DisenosEstilo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Atributos");
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        f.getContentPane().setBackground(new Color(0xF3F6FA));

        JLabel titulo = new JLabel("Cooperativa UPED");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 20));
        titulo.setForeground(new Color(0x0B3D6E));

        JTextField txt = new JTextField("150", 8);
        txt.setFont(new Font("Monospaced", Font.PLAIN, 16));
        txt.setHorizontalAlignment(JTextField.RIGHT);

        JButton btn = new JButton("Confirmar");
        btn.setBackground(new Color(0xF2A900));
        btn.setPreferredSize(new Dimension(130, 36));
        btn.setToolTipText("Confirma la operacion");

        f.add(titulo);
        f.add(txt);
        f.add(btn);

        f.setSize(300, 140);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

