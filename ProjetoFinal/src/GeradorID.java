import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class CPFMask {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                JFrame frame = new JFrame("Máscara de CPF");
                frame.setDefaultCloseOperation(JFrame.EXIT_ONCLOSE);
                frame.setSize(300, 200);

                MaskFormatter mask = new MaskFormatter("###.###.###-##");
                mask.setPlaceholderCharacter(' ');

                JFormattedTextField cpfField = new JFormattedTextField(mask);
                cpfField.setColumns(14);

                JPanel panel = new JPanel();
                panel.add(new JLabel("Digite seu CPF:"));
                panel.add(cpfField);

                frame.add(panel);
                frame.setVisible(true);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}

