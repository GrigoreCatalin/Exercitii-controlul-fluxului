import java.util.Scanner;

public class Bonus1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul.");

        int n = sc.nextInt();
        int x = 0;

        while (true){
            while (n > 0) {
              x = 0;
              x = x * 10 + n % 10;
              n /= 10;
              System.out.print(x + " ");
            }
        System.out.println();
        n =sc.nextInt();
        }
    }
}