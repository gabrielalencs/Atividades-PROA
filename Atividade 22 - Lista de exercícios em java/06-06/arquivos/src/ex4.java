import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(nome);
        }
    }
}
