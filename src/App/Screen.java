package App;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Screen extends JFrame {
    private JPanel panelRight;
    private JPanel panelTop;
    private JList ListPeople;
    private JButton NewButton;
    private JButton ExistingButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel panelMain;
    private JPanel panelLeft;


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


        NewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ExistingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ListPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
    }

    public void refreshPeopleList(){

        listPeopleModel.removeAllElements();

        System.out.println("Removing all people from list");
        for(personne p : people){
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


        personne james = new personne("James Merthy" , "jams@gmail.com","0492426987","24/05/1998");
        personne Daniel = new personne("Jack Daniel's" , "whisky@gmail.com","0492526987","24/05/1999");
        personne Jamson = new personne("Jameson Poliakov" , "vodka@gmail.com","0492426997","24/05/1990");
        personne jonny = new personne("Jonny walker" , "whiskydégueulasse@gmail.com","0472426987","24/05/2000");

        screen.addPerson(james);
        screen.addPerson(Daniel);
        screen.addPerson(Jamson);
        screen.addPerson(jonny);









    }
}
