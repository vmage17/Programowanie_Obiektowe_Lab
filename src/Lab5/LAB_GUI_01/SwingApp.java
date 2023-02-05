package Lab5.LAB_GUI_01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp extends JFrame{
    private JPanel JPanel1;
    private JLabel JLabelA;
    private JLabel JLabelB;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JLabel JLabelWynik;
    private JButton buttonSuma;
    private JButton buttonRoznica;
    private JButton buttonWyjscie;

    double liczbaA, liczbaB, wynik;

    public static void main(String[] args) {
        SwingApp ExampleSwing = new SwingApp();
        ExampleSwing.setVisible(true);

//        JFrame frame = new JFrame("SwingApp");
//        frame.setContentPane(new SwingApp().JPanel1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
    }

    public SwingApp() {
        super("Mój Kalkulator");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.pack();
        buttonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.parseDouble(textFieldA.getText());
                liczbaB = Double.parseDouble(textFieldB.getText());
                wynik = liczbaA + liczbaB;
                JLabelWynik.setText("Różnica: " + String.valueOf(liczbaA) + " + " +
                        String.valueOf(liczbaB) + " = " + String.valueOf(wynik));
            }
        });

        buttonRoznica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.parseDouble(textFieldA.getText());
                liczbaB = Double.parseDouble(textFieldB.getText());
                wynik = liczbaA - liczbaB;
                JLabelWynik.setText("Różnica: " + String.valueOf(liczbaA) + " - " +
                        String.valueOf(liczbaB) + " = " + String.valueOf(wynik));
            }
        });
        buttonWyjscie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

}
