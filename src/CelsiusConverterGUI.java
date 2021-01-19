import javax.swing.*;

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

    }

    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("Celsius Converter");
        frame.setVisible(true);
    }
}
