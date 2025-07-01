import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if(num >= 0 && num <= 100) {
                contador++;
            }
        }

        System.out.println("Números entre 0 e 100: " + contador);
    }
}
