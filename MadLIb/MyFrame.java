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

        JButton enter1;
        enter1 = new JButton("Select Story");
        enter1.setBackground(Color.white);
        enter1.setBounds(350, 400, 100, 50);

        JButton backBtn;
        backBtn = new JButton("GO BACK!");
        backBtn.setBounds(25, 700, 100, 25);

        JLabel l;
        l = new JLabel("MadLib+");
        l.setFont(new Font("Fonts", 3, 50));

        JPanel p = new JPanel();
        p.setBackground(Color.cyan);
        p.add(l);


        String[] optionsToChoose = {"Horror", "Comedy", "Action"};
        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(445, 250, 140, 20);

        DefaultListModel<String> demoList = new DefaultListModel<>();
        demoList.addElement("Story 1");
        demoList.addElement("Story 2");
        demoList.addElement("Story 3");
        JList<String> listd = new JList<>(demoList);
        listd.setBounds(500, 450, 400, 200);
        listd.setBorder(BorderFactory.createLineBorder(Color.black));

        DefaultListModel<String> demoList1 = new DefaultListModel<>();
        demoList1.addElement("Story 4");
        demoList1.addElement("Story 5");
        demoList1.addElement("Story 6");
        JList<String> list1 = new JList<>(demoList1);
        list1.setBounds(500, 450, 400, 200);
        list1.setBorder(BorderFactory.createLineBorder(Color.black));

        DefaultListModel<String> demoList2 = new DefaultListModel<>();
        demoList2.addElement("Story 7");
        demoList2.addElement("Story 8");
        demoList2.addElement("Story 9");
        JList<String> lists2 = new JList<>(demoList2);
        lists2.setBounds(500, 450, 400, 200);
        lists2.setBorder(BorderFactory.createLineBorder(Color.black));


        f.add(enter1);
        f.add(jComboBox);
        f.add(listd);
        f.add(list1);
        f.add(lists2);
        listd.setVisible(false);
        list1.setVisible(false);
        lists2.setVisible(false);
        f.add(backBtn);
        backBtn.setVisible(true);
        f.add(p);
        f.setSize(1000, 900);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);


        enter1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(jComboBox.getItemAt(0), "Horror")){
                    listd.setVisible(true);
                    jComboBox.setVisible(false);
                    enter1.setVisible(false);
                }
                else if (Objects.equals(jComboBox.getItemAt(1), "Comedy")){
                    list1.setVisible(true);
                    jComboBox.setVisible(false);
                    enter1.setVisible(false);
                }
                else if (Objects.equals(jComboBox.getItemAt(2), "Action")){
                    lists2.setVisible(true);
                    jComboBox.setVisible(false);
                    enter1.setVisible(false);
                }
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jComboBox.setVisible(true);
                enter1.setVisible(true);
                listd.setVisible(false);
                list1.setVisible(false);
                lists2.setVisible(false);
            }
        });
    }
}