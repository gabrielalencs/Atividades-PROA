import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
    }
}
