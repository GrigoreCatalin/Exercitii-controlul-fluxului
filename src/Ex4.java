import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti numarul " + (i + 1) + "/" + n + ":");
            int number = sc.nextInt();

                if (number < min){
                    min = number;
                }
                if (number > max) {
                max = number;
                }
                sum += number;
            }
            System.out.println("Valoarea minima este: " +  min);
            System.out.println("Valoarea maxima este: " + max);
            System.out.println("Media aritmetica: " + sum/n);
    }
}
