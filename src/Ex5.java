import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar.");
        int n = sc.nextInt();

        int div = 0;
        int number = 1, sum = 0, divSeven = 0, divFive =0, lastDigit = 0, count = 0, countTwo = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti numarul " + (i + 1) + "/" + n + ".");
            number = sc.nextInt();

            if (number % 7 == 0){
            div++;
            }

            int aux = number, sumDiv = 0;

            while ( aux > 0){
                sumDiv += aux % 10;
                aux /=  10;
            }

            if (sumDiv % 5 ==0){
                divFive++;
            }

            if ((number % 10 == 3) || (number % 10 == 7) || (number % 10 == 9)){
                lastDigit++;
            }

            int y = number;

            while( y > 0){
                count += 1;
                y /= 10;
            }

            int x = number;

            while (x > 9) {
                x /= 10;
            }
            if (x == 2){
                countTwo++;
            }
        }
        System.out.println("Numarul de numere divizibile cu 7 este: " + div);
        System.out.println("Numarul de numere care au suma cifrelor divizibila cu 5 este: " + divFive);
        System.out.println("Numarul de numere care au ultima cifra 3, 7 sau 9 este: " + lastDigit);
        System.out.println("Numarul total de cifre ale numerelor este: " + count);
        System.out.println("Numarul de numere care au prima cifra 2 este: " + countTwo);
    }
}