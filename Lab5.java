
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Lab5 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setVisible(true);

        GridBagLayout gridBagLayout = new GridBagLayout();

        frame.setLayout(gridBagLayout);

        JLabel firstNameLabel = new JLabel("First Name: ");
        JTextField firstNameField = new JTextField(24);
        JLabel lastNameLabel = new JLabel("Last Name: ");
        JTextField lastNameField = new JTextField(24);
        JButton fullNameButton = new JButton("Get full name");

        fullNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();

                if (firstName.equals("") || lastName.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please put first and last name both!");
                } else {
                    String result = firstName + " " + lastName;
                    JOptionPane.showMessageDialog(null, result, "Full Name", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        frame.add(firstNameLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        frame.add(firstNameField, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        frame.add(lastNameLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        frame.add(lastNameField, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        frame.add(fullNameButton, gridBagConstraints);
    }
}
