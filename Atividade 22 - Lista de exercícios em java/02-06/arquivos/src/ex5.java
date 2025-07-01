import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioMinimo = 788;

        System.out.print("Digite seu salário: ");
        double salarioUsuario = input.nextDouble();

        int inteiros = (int) (salarioUsuario / salarioMinimo);
        double resto = salarioUsuario % salarioMinimo;

        System.out.printf("Você recebe %d salários mínimos + R$ %.2f%n", inteiros, resto);
    }

}
