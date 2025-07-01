import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiores = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            if (idade >= 18) {
                maiores++;
            }
        }

        System.out.println("Quantidade de pessoas maiores de idade: " + maiores);
    }
}
