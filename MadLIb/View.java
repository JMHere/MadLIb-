package MadLIb;

import javax.swing.*;
import java.awt.*;

public class View {

    static public void story (JFrame frame) {
        int amountOfInputs = 8;
        int firstTBX = 25;
        int firstTBY = 500;
        int height = 30;
        int width = 100;

        for (int i = 0; i < amountOfInputs; i++) {
            JTextField exf;
            exf = new JTextField();
            if (i == 5) {
                firstTBX = 25;
                firstTBY = firstTBY + height + height;
            }
            exf.setBounds(firstTBX, firstTBY, width, height);
            firstTBX = firstTBX + width + width;
            frame.add(exf);
            if (i == 7) {
                JButton button;
                button = new JButton("Enter");
                button.setBounds(650, 650, 80, 25);
                frame.add(button);

            }
        }

        JPanel p;
        p = new JPanel();
        p.setBackground(Color.cyan);
        frame.add(p);

    }

}
