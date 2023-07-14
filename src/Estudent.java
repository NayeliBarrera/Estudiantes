import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estudent {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JButton guardarDatosEnDiscoButton;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JCheckBox rojoCheckBox;
    private JCheckBox verdeCheckBox;
    private JCheckBox ningunoCheckBox;
    private JRadioButton siRadioButton;
    private JRadioButton noRadioButton;
    private JButton ªButton;
    private JButton button2;
    private JButton cargarDatosDesdeElButton;
    private JTextField textField3;

    public Estudent() {
        guardarDatosEnDiscoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {"Registro guardado";

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Estudent");
        frame.setContentPane(new Estudent().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
