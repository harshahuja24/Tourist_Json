package View;

import Controller.UserController;
import Model.Tourist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdatePageView extends JFrame implements ActionListener {
    JLabel userIdLabel, nameLabel, ageLabel, emailLabel;
    JTextField userIdField, nameField, ageField, emailField;
    JButton updateButton;

    UserController userController = new UserController();

    public UpdatePageView() {
        Container c = getContentPane();
        this.setLayout(null);
        this.setSize(800, 800);
        c.setBackground(Color.cyan);

        userIdLabel = new JLabel("Enter User ID to update");
        userIdLabel.setBounds(50, 50, 200, 40);

        userIdField = new JTextField();
        userIdField.setBounds(250, 50, 200, 40);

        nameLabel = new JLabel("New Name");
        nameLabel.setBounds(50, 100, 200, 40);

        nameField = new JTextField();
        nameField.setBounds(250, 100, 200, 40);

        ageLabel = new JLabel("New Age");
        ageLabel.setBounds(50, 150, 200, 40);

        ageField = new JTextField();
        ageField.setBounds(250, 150, 200, 40);

        emailLabel = new JLabel("New Email");
        emailLabel.setBounds(50, 200, 200, 40);

        emailField = new JTextField();
        emailField.setBounds(250, 200, 200, 40);

        updateButton = new JButton("Update");
        updateButton.setBounds(200, 400, 200, 40);
        updateButton.setBackground(Color.white);
        updateButton.addActionListener(this);

        c.add(userIdLabel);
        c.add(userIdField);
        c.add(nameLabel);
        c.add(nameField);
        c.add(ageLabel);
        c.add(ageField);
        c.add(emailLabel);
        c.add(emailField);
        c.add(updateButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == updateButton) {
            int userId = Integer.parseInt(userIdField.getText());
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String email = emailField.getText();

            userController.updatePatient(userId, 1, name); // 1 corresponds to updating the name
            userController.updatePatient(userId, 2, String.valueOf(age)); // 2 corresponds to updating the age
            userController.updatePatient(userId, 3, email); // 3 corresponds to updating the email

            // You may want to close the current window or update the UI to show that the update is successful.
        }
    }
}
