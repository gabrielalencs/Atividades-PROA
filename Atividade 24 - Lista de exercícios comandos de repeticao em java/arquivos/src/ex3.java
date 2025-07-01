import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.println(nome);
        }
    }
}
