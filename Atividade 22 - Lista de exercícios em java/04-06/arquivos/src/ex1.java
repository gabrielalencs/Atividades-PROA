import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int caloriasPrato = 0, caloriasSobremesa = 0, caloriasBebida = 0;

        System.out.println("Pratos:");

        System.out.println("1 - vegetariano (180 cal)");

        System.out.println("2 - Peixe (230 cal)");

        System.out.println("3 - Frango (250 cal)");

        System.out.println("4 - Carne (350 cal)");

        System.out.print("Escolha o prato (1-4): ");

        int prato = sc.nextInt();

        System.out.println("\nSobremesas:");

        System.out.println("1 - Abacaxi (75 cal)");

        System.out.println("2 - Sorvete diet (110 cal)");

        System.out.println("3 - Mouse diet (170 cal)");

        System.out.println("4 - Mouse chocolate (200 cal)");

        System.out.print("Escolha a sobremesa (1-4): ");

        int sobremesa = sc.nextInt();

        System.out.println("\nBebidas:");

        System.out.println("1 - Chá (20 cal)");

        System.out.println("2 - Suco de laranja (70 cal)");

        System.out.println("3 - Suco de melão (100 cal)");

        System.out.println("4 - Refrigerante diet (65 cal)");

        System.out.print("Escolha a bebida (1-4): ");

        int bebida = sc.nextInt();

        switch (prato) {
            case 1: caloriasPrato = 180; break;
            case 2: caloriasPrato = 230; break;
            case 3: caloriasPrato = 250; break;
            case 4: caloriasPrato = 350; break;
            default: System.out.println("Opção de prato inválida!"); return;
        }

        switch (sobremesa) {
            case 1: caloriasSobremesa = 75; break;
            case 2: caloriasSobremesa = 110; break;
            case 3: caloriasSobremesa = 170; break;
            case 4: caloriasSobremesa = 200; break;
            default: System.out.println("Opção de sobremesa inválida!"); return;
        }

        switch (bebida) {
            case 1: caloriasBebida = 20; break;
            case 2: caloriasBebida = 70; break;
            case 3: caloriasBebida = 100; break;
            case 4: caloriasBebida = 65; break;
            default: System.out.println("Opção de bebida inválida!"); return;
        }

        int totalCalorias = caloriasPrato + caloriasSobremesa + caloriasBebida;

        System.out.println("Total de calorias da refeição: " + totalCalorias + " cal");

    }
}
