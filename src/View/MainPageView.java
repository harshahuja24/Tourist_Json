package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPageView extends JFrame implements ActionListener {
    public JButton createButton, displayButton, editButton, deleteButton;

    public MainPageView() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("User Management System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container c = getContentPane();
        c.setBackground(Color.darkGray);
        this.setLayout(null);
        this.setSize(800, 800);


        createButton = new JButton("Create");
        createButton.setBounds(500,400,100,50);
        createButton.setBackground(Color.cyan);

        createButton.addActionListener(this);

        displayButton = new JButton("Display");
        displayButton.setBounds(650, 400, 100, 50);
        displayButton.setBackground(Color.cyan);

        displayButton.addActionListener(this);

        editButton = new JButton("Update");
        editButton.setBounds(800, 400, 100, 50);
        editButton.setBackground(Color.cyan);

        editButton.addActionListener(this);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(950, 400, 100, 50);
        deleteButton.setBackground(Color.cyan);

        deleteButton.addActionListener(this);

        add(createButton);
        add(displayButton);
        add(editButton);
        add(deleteButton);

        pack();
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createButton) {
            setVisible(false);
            new FormPageView();
        } else if (e.getSource() == displayButton) {
            setVisible(false);
            new DisplayPageView();
        } else if (e.getSource() == editButton) {
            setVisible(false);
            new UpdatePageView();
        } else if (e.getSource() == deleteButton) {
            new DeletePageView();
        }
    }


   /* public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainPageView());
    }*/
}
