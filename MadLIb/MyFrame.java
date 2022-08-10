package MadLIb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame {

    public void createFrame() {

        JFrame f;
        f = new JFrame("MadLib+");

        JButton enterB;
        enterB = new JButton("Enter");
        enterB.setBackground(Color.white);
        enterB.setBounds(150, 200, 75, 25);

        JTextField inputF;
        inputF = new JTextField();
        inputF.setBounds(250, 200, 75, 25);

        JLabel l;
        l = new JLabel("MadLib+");
        l.setFont(new Font("Fonts", 3, 50));

        JPanel p = new JPanel();
        p.setBackground(Color.cyan);
        p.add(l);

        f.add(enterB);
        f.add(inputF);
        f.add(p);
        f.setSize(1000,900);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        enterB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int color = 0;
                p.setBackground(Color.white);
                color++;
                System.out.println(color);
            }
        });
    }
}
