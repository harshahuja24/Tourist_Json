package View;

import Controller.UserController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeletePageView extends JFrame implements ActionListener {
    JLabel userIdLabel;
    JTextField userIdField;
    JButton deleteButton;

    UserController userController = new UserController();

    public DeletePageView() {
        Container c = getContentPane();
        this.setLayout(null);
        this.setSize(400, 300);
        c.setBackground(Color.cyan);

        userIdLabel = new JLabel("Enter User ID to delete");
        userIdLabel.setBounds(50, 50, 200, 40);
        userIdLabel.setBackground(Color.pink);

        userIdField = new JTextField();
        userIdField.setBounds(250, 50, 100, 40);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(150, 150, 100, 40);
        deleteButton.setBackground(Color.white);
        deleteButton.addActionListener(this);

        c.add(userIdLabel);
        c.add(userIdField);
        c.add(deleteButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == deleteButton) {
            int userId = Integer.parseInt(userIdField.getText());
            boolean userFound = false;

            // Check if the user with the given ID exists in the usersArrayList
            for (int i = 0; i < userController.usersArrayList.size(); i++) {
                if (userController.usersArrayList.get(i).getUser_id() == userId) {
                    userFound = true;
                    userController.deletePatient(userId);
                    break;
                }
            }

            if (userFound) {
                // The user was found and deleted.
                // You may want to close the current window or update the UI to show that the user has been deleted.
            } else {
                // Handle the case where the user with the given ID is not found.
                JOptionPane.showMessageDialog(this, "User with ID " + userId + " not found.");
            }
        }
    }
}
