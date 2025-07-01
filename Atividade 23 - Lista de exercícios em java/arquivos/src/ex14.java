import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            soma += sc.nextInt();
        }

        System.out.println("Soma total: " + soma);
    }
}
