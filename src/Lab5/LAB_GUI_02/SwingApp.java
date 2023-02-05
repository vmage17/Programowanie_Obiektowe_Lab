package Lab5.LAB_GUI_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp extends JFrame{
    private JPanel JPanel1;
    private JRadioButton radioButtonLinux;
    private JRadioButton radioButtonWindows;
    private JRadioButton radioButtonMacintosh;
    private JButton buttonOK;
    private JLabel LabelImage;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("Linux.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("Windows.png"));
    private ImageIcon iconMacintosh = new ImageIcon(getClass().getResource("Apple.png"));

    public static ImageIcon resize(ImageIcon src, int destWidth, int destHeight) {
        return new ImageIcon(src.getImage().getScaledInstance(destWidth, destHeight, Image.SCALE_SMOOTH));
    }

    public static void main(String[] args) {
        SwingApp ExampleSwing = new SwingApp();
        ExampleSwing.setVisible(true);
    }

    public SwingApp() {
        super("Mój Kalkulator");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        //this.pack();

        radioButtonLinux.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radioButtonMacintosh.setSelected(false);
                radioButtonWindows.setSelected(false);
                if(radioButtonLinux.isSelected()) {
                    LabelImage.setIcon(resize(iconLinux, 120, 120));
                }
            }
        });

        radioButtonWindows.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radioButtonLinux.setSelected(false);
                radioButtonMacintosh.setSelected(false);
                if(radioButtonWindows.isSelected()) {
                    LabelImage.setIcon(resize(iconWindows, 120, 120));
                }
            }
        });

        radioButtonMacintosh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radioButtonLinux.setSelected(false);
                radioButtonWindows.setSelected(false);
                if(radioButtonMacintosh.isSelected()) {
                    LabelImage.setIcon(resize(iconMacintosh, 120, 120));
                }
            }
        });
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = "";
                if(radioButtonLinux.isSelected()) {
                    selectedOption = "Linux";
                }
                if(radioButtonWindows.isSelected()) {
                    selectedOption = "Windows";
                }
                if(radioButtonMacintosh.isSelected()) {
                    selectedOption = "Macintosh";
                }
                JOptionPane.showMessageDialog(SwingApp.this, "Wybrano system: " + selectedOption);
            }
        });
    }

}
