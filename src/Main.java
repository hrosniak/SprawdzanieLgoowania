import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "Portfel123";
        String password = "Woda2020";



        System.out.println("Tap your login: ");
        String lo = sc.nextLine() ;


        System.out.println("Tap your password: ");
        String pas = sc.nextLine() ;

        if (lo.equals(login) && pas.equals(password)) {
            System.out.println("Login succesfull");
        } else
            System.out.println("Try again!!!");

    }
}