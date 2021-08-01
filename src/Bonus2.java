import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul.");

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti numarul " + (i + 1) + "/" + n + ":");
            int number = sc.nextInt();

            if (number != 0 && number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
            System.out.println("Numarul cu cele mai putine cifre este: " + min);
            System.out.println("Numarul cu cele mai multe cifre este: " + max);
    }
}