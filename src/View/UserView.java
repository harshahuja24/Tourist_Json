package View;

import Controller.UserController;
import Model.Tourist;

import java.util.Scanner;

public class UserView {
    //display options for user in the view package
    UserController userController = new UserController();
    Scanner sc = new Scanner(System.in);

    public void displayOptions() {
        int option;

        do {
            System.out.println("----------------------------");
            System.out.println("Enter your option");
            System.out.println("1.Create new User");
            System.out.println("2.Display all the User ");
            System.out.println("3.Update User ");
            System.out.println("4.Delete a User ");
            System.out.println("5.Exit");
            System.out.println("---------------------------");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter User name ");
                    String name = sc.nextLine();
                    System.out.println("Enter User id :");
                    int id = sc.nextInt();
                    System.out.println("Enter User age");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter User Surname");
                    String surname = sc.nextLine();
                    Tourist u = new Tourist(name,surname,age,id);
                    userController.addPatient(u);
                    break;

                case 2:
                    System.out.println("--------------------");
                    userController.displayPatient();
                    ;
                    break;

                case 3:
                    System.out.println("Enter id for which you have to update ");
                    int rn = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Choose option");
                    System.out.println("1.Name");
                    System.out.println("2.age");
                    System.out.println("3.Surname");
                    System.out.println("4.Exit");
                    int innerOption = sc.nextInt();
                    sc.nextLine();
                    switch (innerOption) {
                        case 1:
                            System.out.println("Enter new name");
                            String newName = sc.nextLine();
                            userController.updatePatient(rn, innerOption, newName);
                            break;
                        case 2:
                            System.out.println("Enter new age ");
                            int newAge = sc.nextInt();
                            sc.nextLine();
                            userController.updatePatient(rn, innerOption, String.valueOf(newAge));
                        case 3:
                            System.out.println("Enter new Email");
                            String newEmail = sc.nextLine();
                            userController.updatePatient(rn, innerOption, newEmail);
                            break;
                        case 4:
                            break;
                    }
                case 4:
                    System.out.println("Enter ID of the patient to delete ");
                    int rn1 = sc.nextInt();
                    sc.nextLine();
                    userController.deletePatient(rn1);
                    break;
                case 5:
                    break;
            }
        } while (option != 5);
    }

    /*public void displayPageOptions() {
    }*/

    public void displayPageOptions()
    {
        MainPageView mainPageView=new MainPageView();
    }
}
