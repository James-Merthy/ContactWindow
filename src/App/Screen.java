package App;

import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame{
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

    public Screen(){

        super("my Contact project");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {

        Screen screen = new Screen();

        screen.setVisible(true);

    }
}
