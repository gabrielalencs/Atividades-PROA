import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o saldo: R$ ");
        double saldo = sc.nextDouble();

        double novoSaldo = saldo * 1.015;
        System.out.printf("Saldo reajustado: R$ %.2f", novoSaldo);
    }
}
