import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int numeroDigitado = input.nextInt();

        int antecessor = numeroDigitado - 1;
        int sucessor = numeroDigitado + 1;


        System.out.println("O antecessor de " + numeroDigitado + " é " + antecessor + " e seu sucessor é " + sucessor);

    }

}
