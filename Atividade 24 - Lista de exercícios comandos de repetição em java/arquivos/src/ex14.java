import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entre0e100 = 0, entre101e200 = 0, maiores200 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num >= 0 && num <= 100) {
                entre0e100++;
            } else if (num >= 101 && num <= 200) {
                entre101e200++;
            } else if (num > 200) {
                maiores200++;
            }
        }

        System.out.println("Entre 0 e 100: " + entre0e100);
        System.out.println("Entre 101 e 200: " + entre101e200);
        System.out.println("Maiores que 200: " + maiores200);
    }
}
