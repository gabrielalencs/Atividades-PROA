import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cotação do dólar (R$): ");
        double cotacao = sc.nextDouble();

        System.out.print("Quantidade em dólares (US$): ");
        double dolares = sc.nextDouble();

        double reais = dolares * cotacao;
        System.out.printf("Valor em reais: R$ %.2f", reais);
    }
}
