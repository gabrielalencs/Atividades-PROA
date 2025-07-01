import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");

        double a = sc.nextDouble();

        System.out.print("Digite o valor de B: ");

        double b = sc.nextDouble();

        System.out.print("Digite o valor de C: ");

        double c = sc.nextDouble();

        double maior, meio, menor;

        if (a >= b && a >= c) {

            maior = a;

            if (b >= c) {

                meio = b;

                menor = c;

            } else {

                meio = c;

                menor = b;

            }

        } else if (b >= a && b >= c) {

            maior = b;

            if (a >= c) {

                meio = a;

                menor = c;

            } else {

                meio = c;

                menor = a;

            }

        } else {

            maior = c;

            if (a >= b) {

                meio = a;

                menor = b;

            } else {

                meio = b;

                menor = a;

            }

        }

        System.out.println("Valores em ordem descendente: " + maior + ", " + meio + ", " + menor);

    }
}
