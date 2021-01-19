import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField celsiusTexField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;

    public CelsiusConverterGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //content that goes in form
        this.setContentPane(mainPanel);
        this.pack();

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Parse degrees Celsius as a double and convert to Fahrenheit.
                int tempFahr = (int)((Double.parseDouble(celsiusTexField.getText()))
                        * 1.8 + 32);
                fahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("Celsius Converter");
        frame.setVisible(true);
    }
}
