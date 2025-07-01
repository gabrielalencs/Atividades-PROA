import java.util.Scanner;

public class ex24e25 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int soma = 0;
            int numero;

            while(true) {
                System.out.print("Digite um número (negativo para sair): ");
                numero = sc.nextInt();

                if(numero < 0) {
                    break;
                }

                soma += numero;
            }

            System.out.println("Soma dos números: " + soma);
        }

}
