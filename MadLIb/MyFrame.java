package MadLIb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
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
        storyName = new JButton("Enter S");
        storyName.setBackground(Color.white);
        storyName.setBounds(300, 500, 70,50);

        JTextField storyChoice;
        storyChoice = new JTextField();
        storyChoice.setBounds(400, 490,140,20);

        JTextPane random;
        random = new JTextPane();
        random.setBackground(Color.white);
        random.setBounds(350, 490, 300, 300);

        JLabel l;
        l = new JLabel("MadLib+");
        l.setFont(new Font("Fonts", 3, 50));

        JPanel p = new JPanel();
        p.setBackground(Color.cyan);
        p.add(l);

        JTextField storyInput;
        storyInput = new JTextField();
        storyInput.setBounds(410, 250, 140, 20);

        JButton storyIButton;
        storyIButton = new JButton("Enter");
        storyIButton.setBounds(410, 310, 140, 20);

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
        f.add(random);
        f.add(storyInput);
        f.add(storyIButton);
        storyInput.setVisible(false);
        storyIButton.setVisible(false);
        random.setVisible(false);
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
                else if (find.equals("Comedy")){
                    list.setVisible(false);
                    list1.setVisible(true);
                    list2.setVisible(false);

                    jComboBox.setVisible(false);
                    enter1.setVisible(false);
                    storyName.setVisible(true);
                    storyChoice.setVisible(true);
                }
                else if (find.equals("Action")){
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
                storyName.setVisible(false);
                storyChoice.setVisible(false);
                enter1.setVisible(true);
                list.setVisible(false);
                list1.setVisible(false);
                list2.setVisible(false);
                random.setVisible(false);
                storyInput.setVisible(false);
                storyIButton.setVisible(false);
            }
        });

        storyName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(storyChoice.getText(), "Story 1")){
                    random.setVisible(true);
                    random.setText(storyChange());
                    storyInput.setVisible(true);
                    storyIButton.setVisible(true);
                }
                else if (Objects.equals(storyChoice.getText(), "Story 2")){
                    random.setVisible(true);
                    random.setText("Hello World");
                }
                else if (Objects.equals(storyChoice.getText(), "Story 3")){
                    random.setVisible(true);
                    random.setText("Goodbye");
                }

                storyName.setVisible(false);
                storyChoice.setVisible(false);
                jComboBox.setVisible(false);
                enter1.setVisible(false);
                list.setVisible(false);
                list1.setVisible(false);
                list2.setVisible(false);
            }
        });

        storyIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = storyInput.getText();
                String[] parsed;
                parsed = input.split(", ");

                random.setText(storyChange(parsed));
            }
        });

    }

    public String storyChange() {
        String story = "";

        String adjective = "__Enter adjective__";
        String adjective2 = "__Enter adjective__";
        String bird = "__type of bird__";
        String roomInHouse = "__Room in a house__";
        String verbPast = "__verb(past tense)__";
        String verb = "__Verb__";
        String relative = "__relative's name__";
        String noun = "__noun__";
        String liquid = "__a liquid__";
        String verbing = "__Verb ending in -ing__";
        String partOfBodys = "__part of a boy (Plural)__";
        String pNoun = "__plural noun__";
        String verbing2 = "__verb ending in -ing__";
        String noun2 = "__noun__";

        story = "It was a " + adjective + ", cold November day I woke up to the " +adjective2
                + " smell of " + bird + " roasting in the " + roomInHouse
                + " downstairs. I " + verbPast + " down the stairs to see if I could help " + verb
                + " the dinner. My mom said, 'See if " + relative + " needs a fresh " + noun
                + ".' So I carried a tray of glasses full of " + liquid + " into the " +
                verbing + " room. When I got there, I couldn't believe my " + partOfBodys +
                "! There were " + pNoun + " " + verbing2 + " on the " + noun2 + "!";

        return story;
    }

    public String storyChange(String[] array) {
        String story = "";



        String adjective = array[0];
        String adjective2 = array[1];
        String bird = array[2];
        String roomInHouse = array[3];
        String verbPast = array[4];
        String verb = array[5];
        String relative = array[6];
        String noun = array[7];
        String liquid = array[8];
        String verbing = array[9];
        String partOfBodys = array[10];
        String pNoun = array[11];
        String verbing2 = array[12];
        String noun2 = array[13];

        story = "It was a " + adjective + ", cold November day I woke up to the " +adjective2
                + " smell of " + bird + " roasting in the " + roomInHouse
                + " downstairs. I " + verbPast + " down the stairs to see if I could help " + verb
                + " the dinner. My mom said, 'See if " + relative + " needs a fresh " + noun
                + ".' So I carried a tray of glasses full of " + liquid + " into the " +
                verbing + " room. When I got there, I couldn't believe my " + partOfBodys +
                "! There were " + pNoun + " " + verbing2 + " on the " + noun2 + "!";

        return story;
    }
}