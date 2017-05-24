import exceptions.GtException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.valueOf;

/**
 * Created by Pantho on 2017-05-24.
 */
public class Calc {
    private JPanel pamel1; private JPanel mainPanel;
    private JTextField textUL;
    private JTextField textUR;
    private JTextField textDL;
    private JTextField textDR;
    private JButton findEq;
    private JButton back;
    public static String valUL;
    public static String valUR;
    public static String valDL;
    public static String valDR;


    public Calc() {

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IndexFrame.inFrame.setVisible(true);
                Menu.caFrame.setVisible(false);
            }
        });

        findEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    valUL = String.valueOf(textUL.getText());
                    valUR = String.valueOf(textUR.getText());
                    valDL = String.valueOf(textDL.getText());
                    valDR = String.valueOf(textDR.getText());
                    Meat.welcome();
                } catch (NumberFormatException nNum) {
                JOptionPane.showMessageDialog(null,
                        "The input is not acceptable. \n" +
                                "Please input two numbers \n" +
                                "separated by a comma. Eg: 2,1","Invalid Input",
                        JOptionPane.WARNING_MESSAGE);
                }
            }
        });

    }

    public JPanel getPanel1() {
        return pamel1;
    }
}
