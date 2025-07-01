import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiores = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.print("Idade " + i + ": ");
            int idade = sc.nextInt();

            if(idade >= 18) {
                maiores++;
            }
        }

        System.out.println("Pessoas maiores de idade: " + maiores);
    }
}
