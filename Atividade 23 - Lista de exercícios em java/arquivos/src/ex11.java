import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        String nome = sc.nextLine();

        System.out.print("Salário fixo: R$ ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Total de vendas: R$ ");
        double vendas = sc.nextDouble();

        double salarioFinal = salarioFixo + (vendas * 0.15);

        System.out.println("\nResumo:");
        System.out.println("Nome: " + nome);
        System.out.printf("Salário fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Salário final: R$ %.2f", salarioFinal);
    }
}
