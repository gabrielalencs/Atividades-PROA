import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        final double SALARIO_MINIMO = 1212.00;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário: R$ ");
        double salario = sc.nextDouble();

        double qtdSalarios = salario / SALARIO_MINIMO;
        System.out.printf("Você recebe %.1f salários mínimos", qtdSalarios);
    }
}
