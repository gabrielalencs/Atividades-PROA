import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            soma += idade;
        }

        double media = soma / 20.0;
        System.out.println("A média das idades é: " + media);
    }
}
