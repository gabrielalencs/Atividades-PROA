import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor da compra: R$ ");
        double valor = sc.nextDouble();

        double prestacao = valor / 5;
        System.out.printf("Valor das prestações (5x): R$ %.2f", prestacao);
    }
}
