import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        double porcIpi = input.nextDouble();
        input.nextLine();  // consome o Enter pendente


        String[] codigos = new String[2];
        double[] valores = new double[2];
        int[] quantidades = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o código da " + (i + 1) + "º peça: ");
            codigos[i] = input.nextLine();

            System.out.print("Digite o valor unitário da " + (i + 1) + "º peça: ");
            valores[i] = input.nextDouble();
            input.nextLine();

            System.out.print("Digite a quantidade da " + (i + 1) + "º peça: ");
            quantidades[i] = input.nextInt();
            input.nextLine();

        }

        System.out.println(porcIpi);

        for (int i = 0; i < 2; i++) {
            System.out.println("\n Dados da " + (i + 1) + "º peça:");
            System.out.println("Código: " + codigos[i]);
            System.out.println("Valor unitário: " + valores[i]);
            System.out.println("Quantidade: " + quantidades[i]);
        }

        System.out.println("-------------------------------------");


        double valorTotal = (valores[0] * quantidades[0] + valores[1] * quantidades[1]) * (porcIpi /100 + 1);

        System.out.println("O valor total a ser pago é: " + valorTotal);


    }

}
