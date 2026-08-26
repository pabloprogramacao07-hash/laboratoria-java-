import java.util.Scanner;

public class App2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");

        String userName = scanner.nextLine();

        printWelcomeMessage(userName);

        scanner.close();
    }

    private static void printWelcomeMessage(String userName) {
        System.out.println("Bem vinda(o), " + userName + "!");
    }
}