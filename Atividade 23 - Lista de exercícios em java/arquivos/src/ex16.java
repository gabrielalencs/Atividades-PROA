import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.print("Idade " + i + ": ");
            soma += sc.nextInt();
        }

        double media = soma / 20.0;
        System.out.println("Média das idades: " + media);
    }
}
