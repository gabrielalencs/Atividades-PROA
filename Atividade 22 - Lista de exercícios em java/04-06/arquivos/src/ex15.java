import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.print("Idade " + i + ": ");
            soma += sc.nextInt();
        }

        System.out.println("Soma das idades: " + soma);
    }
}
