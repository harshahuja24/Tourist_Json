package View;

import Controller.UserController;
import Model.Tourist;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DisplayPageView extends JFrame {
    JButton h1, h2, h3, h4, h5;
    UserController userController = new UserController();

    public DisplayPageView() {
        Container c = getContentPane();
        this.setSize(400, (userController.usersArrayList.size() + 1) * 60);
        this.setLayout(new GridLayout(userController.usersArrayList.size() + 1, 5));
        c.setBackground(Color.cyan);

        h1 = new JButton("Tourist id");
        h1.setBackground(Color.pink);
        h2 = new JButton("Name");
        h2.setBackground(Color.pink);
        h3 = new JButton("Email");
        h3.setBackground(Color.pink);
        h4 = new JButton("Phone number ");
        h4.setBackground(Color.pink);
        //h5 = new JButton("Email");

        c.add(h1);

        c.add(h2);
        c.add(h3);
        c.add(h4);
        //c.add(h5);

        ArrayList<Tourist> users = userController.usersArrayList;

        for (int i = 0; i < userController.usersArrayList.size(); i++) {
            JButton b1 = new JButton(String.valueOf(users.get(i).getUser_id()));
            b1.setBackground(Color.white);
            JButton b2 = new JButton(users.get(i).getName());
            b2.setBackground(Color.white);
            JButton b3 = new JButton(users.get(i).getSurname());
            b3.setBackground(Color.white);
            JButton b4 = new JButton(String.valueOf(users.get(i).getAge()));
            b4.setBackground(Color.white);


            c.add(b1);
            c.add(b2);
            c.add(b3);
            c.add(b4);
            //c.add(b5);
        }
        this.setVisible(true);
    }
}
