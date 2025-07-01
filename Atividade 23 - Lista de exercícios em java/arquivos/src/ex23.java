import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int faixa1 = 0, faixa2 = 0, faixa3 = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if(num >= 0 && num <= 100) {
                faixa1++;
            } else if(num >= 101 && num <= 200) {
                faixa2++;
            } else if(num > 200) {
                faixa3++;
            }
        }

        System.out.println("Entre 0-100: " + faixa1);
        System.out.println("Entre 101-200: " + faixa2);
        System.out.println("Maiores que 200: " + faixa3);
    }
}
