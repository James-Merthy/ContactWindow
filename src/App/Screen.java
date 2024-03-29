package App;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Screen extends JFrame {
    private JPanel PanelLeft;
    private JPanel panelTop;
    private JList ListPeople;
    private JButton ButtonNew;
    private JButton ButtonSave;
    private JTextField textName;
    private JTextField textEmail;
    private JTextField textPhoneNumber;
    private JTextField textAdresse;
    private JPanel panelMain;
    private JPanel PanelRight;
    private JTextField textDateOfBirth;
    private JLabel LabelAge;
    private JLabel Title;
    private JLabel title2;


    private ArrayList<personne> people;

    private DefaultListModel listPeopleModel;

    public Screen() {

        super("my Contact project");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        people = new ArrayList<personne>();
        listPeopleModel = new DefaultListModel();
        ListPeople.setModel(listPeopleModel);
        ButtonSave.setEnabled(false);


        ButtonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                personne p = new personne(textName.getText(), textEmail.getText(), textPhoneNumber.getText(), textDateOfBirth.getText());

                people.add(p);
                refreshPeopleList();

            }


        });
        ButtonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int personNumber = ListPeople.getSelectedIndex();
                if (personNumber >= 0) {
                    personne p = people.get(personNumber);
                    p.setName(textName.getText());
                    p.setEmail(textEmail.getText());
                    p.setPhoneNumber(textPhoneNumber.getText());
                    p.setDateOfBirth(textDateOfBirth.getText());
                    refreshPeopleList();
                }
            }
        });
        ListPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                int personNumber = ListPeople.getSelectedIndex();
                if (personNumber >= 0) {
                    personne p = people.get(personNumber);
                    textName.setText(p.getName());
                    textEmail.setText(p.getEmail());
                    textPhoneNumber.setText(p.getPhoneNumber());
                    //textAdresse.setText(p.getPhoneNumber());
                    textDateOfBirth.setText(p.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    LabelAge.setText(Integer.toString(p.getAge()) + " years");
                    ButtonSave.setEnabled(true);

                } else {

                    ButtonSave.setEnabled(true);
                }
            }
        });
    }

    public void refreshPeopleList() {

        listPeopleModel.removeAllElements();

        System.out.println("Removing all people from list");
        for (personne p : people) {
            System.out.println("Adding person to list : " + p.getName());
            listPeopleModel.addElement(p.getName());
        }
    }

    public void addPerson(personne p) {

        people.add(p);
        refreshPeopleList();


    }

    public static void main(String[] args) {

        Screen screen = new Screen();


        screen.setVisible(true);


        personne james = new personne("James Merthy", "jams@gmail.com", "0492426987", "24/05/1998");
        personne Daniel = new personne("Jack Daniel's", "whisky@gmail.com", "0492526987", "24/05/1999");
        personne Jamson = new personne("Jameson Poliakov", "vodka@gmail.com", "0492426997", "24/05/1990");
        personne jonny = new personne("Jonny walker", "whiskydégueulasse@gmail.com", "0472426987", "24/05/2000");
        personne Havanna = new personne("Havana Rhum blan ", "Jaimepaslerhumblanc@gmail.com", "0472455587", "24/11/1995");


        screen.addPerson(james);
        screen.addPerson(Daniel);
        screen.addPerson(Jamson);
        screen.addPerson(jonny);
        screen.addPerson(Havanna);


    }
}
