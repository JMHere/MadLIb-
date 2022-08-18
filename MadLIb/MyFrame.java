package MadLIb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class MyFrame {
    public void createFrame() {

        JFrame f;
        f = new JFrame("MadLib+");

        JButton enter1;
        enter1 = new JButton("Select Story");
        enter1.setBackground(Color.white);
        enter1.setBounds(350, 400, 100, 50);

        JButton backBtn;
        backBtn = new JButton("GO BACK!");
        backBtn.setBounds(25, 700, 100, 25);

        JButton storyName;
        storyName = new JButton("Enter");
        storyName.setBackground(Color.white);
        storyName.setBounds(300, 500, 70,50);

        JTextField storyChoice;
        storyChoice = new JTextField();
        storyChoice.setBounds(400, 490,140,20);

        JLabel l;
        l = new JLabel("MadLib+");
        l.setFont(new Font("Fonts", 3, 50));

        JPanel p = new JPanel();
        p.setBackground(Color.cyan);
        p.add(l);


        String[] optionsToChoose = {"Horror", "Comedy", "Action"};
        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(410, 250, 140, 20);

        DefaultListModel<String> demoList = new DefaultListModel<>();
        demoList.addElement("Story 1");
        demoList.addElement("Story 2");
        demoList.addElement("Story 3");
        JList<String> list = new JList<>(demoList);
        list.setBounds(325, 250, 400, 200);
        list.setBorder(BorderFactory.createLineBorder(Color.black));

        DefaultListModel<String> demoList1 = new DefaultListModel<>();
        demoList1.addElement("Story 4");
        demoList1.addElement("Story 5");
        demoList1.addElement("Story 6");
        JList<String> list1 = new JList<>(demoList1);
        list1.setBounds(325, 250, 400, 200);
        list1.setBorder(BorderFactory.createLineBorder(Color.black));

        DefaultListModel<String> demoList2 = new DefaultListModel<>();
        demoList2.addElement("Story 7");
        demoList2.addElement("Story 8");
        demoList2.addElement("Story 9");
        JList<String> list2 = new JList<>(demoList2);
        list2.setBounds(325, 250, 400, 200);
        list2.setBorder(BorderFactory.createLineBorder(Color.black));


        f.add(enter1);
        f.add(jComboBox);
        f.add(list);
        f.add(list1);
        f.add(list2);
        list.setVisible(false);
        list1.setVisible(false);
        list2.setVisible(false);
        f.add(backBtn);
        f.add(storyName);
        storyName.setVisible(false);
        f.add(storyChoice);
        storyChoice.setVisible(false);
        backBtn.setVisible(true);
        f.add(p);
        f.setSize(1000, 900);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);


        enter1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String find = jComboBox.getSelectedItem().toString();

                if (find.equals("Horror")){
                    list.setVisible(true);
                    list1.setVisible(false);
                    list2.setVisible(false);

                    jComboBox.setVisible(false);
                    enter1.setVisible(false);
                    storyName.setVisible(true);
                    storyChoice.setVisible(true);
                }
                if (find.equals("Comedy")){
                    list.setVisible(false);
                    list1.setVisible(true);
                    list2.setVisible(false);

                    jComboBox.setVisible(false);
                    enter1.setVisible(false);
                    storyName.setVisible(true);
                    storyChoice.setVisible(true);
                }
                if (find.equals("Action")){
                    list.setVisible(false);
                    list1.setVisible(false);
                    list2.setVisible(true);

                    jComboBox.setVisible(false);
                    enter1.setVisible(false);
                    storyName.setVisible(true);
                    storyChoice.setVisible(true);
                }
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jComboBox.setVisible(true);
                storyChoice.setText("");
                enter1.setVisible(true);
                list.setVisible(false);
                list1.setVisible(false);
                list2.setVisible(false);
            }
        });

        storyName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                storyName.setVisible(false);
                storyChoice.setVisible(false);
                jComboBox.setVisible(false);
                enter1.setVisible(false);
                list.setVisible(false);
                list1.setVisible(false);
                list2.setVisible(false);
            }
        });
    }
}