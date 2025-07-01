import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em °C: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("Temperatura em °F: " + fahrenheit);
    }
}
