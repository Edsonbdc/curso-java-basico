import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int option = 0;
        String name = null, userName = null, password = null;
        do {
            System.out.println("============My Bank============");
            System.out.println("1-new account | 2-list accounts | 3-Close");
            option = teclado.nextInt();
            teclado.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Name: ");
                    name = teclado.nextLine();
                    System.out.println("User name: ");
                    userName = teclado.nextLine();
                    System.out.println("Password: ");
                    password = teclado.nextLine();
                    break;
                case 2:
                    System.out.println("Name: "+name+"\n"+"User name: "+userName+"\n"+"Password: "+password);
                    break;
                case 3:
                default:
                    System.out.println("App closed");

            }
        } while (option != 3);
    }
}
