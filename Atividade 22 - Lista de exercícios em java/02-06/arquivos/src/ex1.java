import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        // scanner faz parte da biblioteca padrão do Java.
        // ele serve pra ler entradas do teclado
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de anos: ");
        int anos = input.nextInt(); // lê a próximo número inteiro digitado no console

        System.out.print("Digite a quantidade de meses: ");
        int meses = input.nextInt();

        System.out.print("Digite a quantidade de dias: ");
        int dias = input.nextInt();

        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade em dias é: " + idadeEmDias);
    }

}
