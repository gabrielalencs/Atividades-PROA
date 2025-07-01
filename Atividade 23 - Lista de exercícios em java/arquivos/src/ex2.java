import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int numero = sc.nextInt();

        boolean div10 = (numero % 10 == 0);

        boolean div5 = (numero % 5 == 0);

        boolean div2 = (numero % 2 == 0);

        if (div10) {

            System.out.println("Divisível por 10");
        }

        if (div5) {

            System.out.println("Divisível por 5");

        }

        if (div2) {

            System.out.println("Divisível por 2");

        }

        if (!div10 && !div5 && !div2) {

            System.out.println("Não é divisível por 10, 5 ou 2");

        }

    }
}
