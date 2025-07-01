import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um saldo: ");
        int saldoAtual = input.nextInt();

        double saldoComReajuste = saldoAtual + (saldoAtual * 0.01);

        System.out.println(saldoComReajuste);

    }

}
