package MadLIb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class MyFrame {
    public void createFrame() throws IOException {

        JFrame f;
        f = new JFrame("MadLib+");

        JButton enterB;
        enterB = new JButton("Enter");
        enterB.setBackground(Color.white);
        enterB.setBounds(150, 200, 75, 25);

        JTextField inputF;
        inputF = new JTextField();
        inputF.setBounds(250, 200, 75, 25);

        JButton enter1;
        enter1 = new JButton("Select Story");
        enter1.setBackground(Color.white);
        enter1.setBounds(350, 400, 100, 50);

        JTextField storyInput;
        storyInput = new JTextField();
        storyInput.setBounds(450, 400, 100, 50);

        JButton backBtn;
        backBtn = new JButton("GO BACK!");
        backBtn.setBounds(25, 700, 100, 25);

        JLabel l;
        l = new JLabel("MadLib+");
        l.setFont(new Font("Fonts", 3, 50));

        ImageIcon icon = new ImageIcon("Panel Back.jpg");
        icon.setImage(icon.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT));
        JLabel pic = new JLabel(icon);

        JPanel p = new JPanel();
        p.setBackground(Color.cyan);
        p.add(pic);
        p.add(l);

        DefaultListModel<String> demoList = new DefaultListModel<>();
        demoList.addElement("Story 1");
        demoList.addElement("Story 2");
        demoList.addElement("Story 3");

        JList<String> listd = new JList<>(demoList);
        listd.setBounds(500, 450, 400, 200);
        listd.setBorder(BorderFactory.createLineBorder(Color.black));

        DefaultListModel<String> demoList1 = new DefaultListModel<>();
        demoList1.addElement("Story 1");
        demoList1.addElement("Story 2");
        demoList1.addElement("Story 3");

        JList<String> listd1 = new JList<>(demoList);
        listd1.setBounds(500, 450, 400, 200);
        listd1.setBorder(BorderFactory.createLineBorder(Color.black));


        DefaultListModel<String> demoList2 = new DefaultListModel<>();
        demoList2.addElement("Story 1");
        demoList2.addElement("Story 2");
        demoList2.addElement("Story 3");

        JList<String> listd2 = new JList<>(demoList);
        listd2.setBounds(500, 450, 400, 200);
        listd2.setBorder(BorderFactory.createLineBorder(Color.black));


        f.add(enterB);
        f.add(inputF);
        f.add(enter1);
        f.add(storyInput);
        f.add(listd);
        f.add(listd1);
        f.add(listd2);
        listd.setVisible(false);
        listd1.setVisible(false);
        listd2.setVisible(false);
        f.add(backBtn);
        backBtn.setVisible(true);
        f.add(p);
        f.setSize(1000, 900);
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

        enter1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(storyInput.getText(), "Horror")){
                    listd.setVisible(true);
                    enterB.setVisible(false);
                    inputF.setVisible(false);
                    storyInput.setVisible(false);
                    enter1.setVisible(false);
                }
                else if (Objects.equals(storyInput.getText(), "Comedy")){
                    listd1.setVisible(true);
                    enterB.setVisible(false);
                    inputF.setVisible(false);
                    storyInput.setVisible(false);
                    enter1.setVisible(false);
                }
                else if (Objects.equals(storyInput.getText(), "Action")){
                    listd2.setVisible(true);
                    enterB.setVisible(false);
                    inputF.setVisible(false);
                    storyInput.setVisible(false);
                    enter1.setVisible(false);
                }
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterB.setVisible(true);
                inputF.setVisible(true);
                storyInput.setVisible(true);
                storyInput.setText("");
                enter1.setVisible(true);
                listd.setVisible(false);
                listd1.setVisible(false);
                listd2.setVisible(false);
            }
        });
    }
}