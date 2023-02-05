package Lab6;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIExample extends  JFrame{
    private JPanel JPanel1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTable table1;

    public static void main(String[] args) {
        GUIExample obj = new GUIExample();
        obj.setVisible(true);
    }

    public GUIExample()   {
        super("tekt");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,360);

        createTable();


        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox1.getSelectedItem();
            }
        });
    }

    private void createTable(){
        Object [][] data={
                {"film 1", 2023, 6.56, 1234},
                {"film 2", 2021, 4.56, 1234},
                {"film 3", 1999, 8.56, 1234}
        };
        table1.setModel(new DefaultTableModel(
                data,
                new String[]{"tytul", "rok wydania","ocena", "ilosc komentarzy"}
        ));

        TableColumnModel columnModel = table1.getColumnModel();
        columnModel.getColumn(0).setMinWidth(200);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        columnModel.getColumn(1).setCellRenderer(centerRenderer);
        columnModel.getColumn(2).setCellRenderer(centerRenderer);
        columnModel.getColumn(3).setCellRenderer(centerRenderer);


    }

}
