import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if(num > 8) {
                contador++;
            }
        }

        System.out.println("Números maiores que 8: " + contador);
    }
}
