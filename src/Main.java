import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String login = "Portfel123";
        String password = "Woda2020";


        Scanner sc = new Scanner(System.in);


        System.out.println("Tap your login: ");
        String lo = sc.nextLine();

        System.out.println("Tap your password: ");
        String pas = sc.nextLine();


        if (login == lo && password == pas) {
            System.out.println("Login succesfull");
        } else
            System.out.println("Try again!!!");

    }
}