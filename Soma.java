import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Sacanner entrada = new Scanner(System.in);
        int primNumero, seyNumero;
        int soma
        System.out.print("Digite o primeiro número: ");
        primNumero = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        segNumero = entrada.nextInt();
        soma = primNumero + segNumero;
        System.out.println("A soma é\;" + soma);
        entrada.close();
    }
}
