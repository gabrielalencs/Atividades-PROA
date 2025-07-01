import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            int num = sc.nextInt();

            if (num < 0) {
                break;
            }

            soma += num;
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
