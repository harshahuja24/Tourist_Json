package View;

import Controller.UserController;
import Model.Tourist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPageView extends JFrame implements ActionListener {

    JLabel nameLabel, surnameLabel, userIdLabel, ageLabel;
    JTextField nameField, surnameField, userIdField, ageField;
    JButton addButton;
    UserController userController = new UserController();

    public FormPageView() {
        Container c = getContentPane();
        this.setLayout(null);
        this.setSize(800, 800);
        c.setBackground(Color.cyan);

        nameLabel = new JLabel("Enter Name:");

        nameLabel.setBounds(50, 50, 100, 40);


        nameField = new JTextField();
        nameField.setBounds(200, 50, 200, 40);


        surnameLabel = new JLabel("Enter Email");
        surnameLabel.setBounds(50, 140, 100, 40);

        surnameField = new JTextField();
        surnameField.setBounds(200, 140, 200, 40);

        userIdLabel = new JLabel("Enter tourist ID:");
        userIdLabel.setBounds(50, 230, 100, 40);

        userIdField = new JTextField();
        userIdField.setBounds(200, 230, 200, 40);

        ageLabel = new JLabel("Enter Age ");
        ageLabel.setBounds(50, 320, 100, 40);

        ageField = new JTextField();
        ageField.setBounds(200, 320, 200, 40);

        addButton = new JButton("Add");
        addButton.setBounds(150, 460, 200, 40);

        addButton.addActionListener(this);
        c.add(nameLabel);
        c.add(nameField);

        c.add(surnameLabel);
        c.add(surnameField);

        c.add(userIdLabel);
        c.add(userIdField);

        c.add(ageLabel);
        c.add(ageField);

        c.add(addButton);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            String name = nameField.getText();
            String surname = surnameField.getText();
            String userIdStr = userIdField.getText();
            int userId = Integer.parseInt(userIdStr);
            String ageStr = ageField.getText();
            int age = Integer.parseInt(ageStr);

            Tourist user = new Tourist(name,surname,age,userId);
            userController.addPatient(user);
        }
    }
}
