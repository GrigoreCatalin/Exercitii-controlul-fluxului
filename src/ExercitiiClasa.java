import java.util.Scanner;

public class ExercitiiClasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        boolean check = false;

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number == 0 || number < 0){
                number = max;
            }
                if (number >= max) {
                    max = number;
                    check = true;
                }else{
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println("Este crescator");
            }else{
                System.out.println("Nu este crescator");
            }
            }
        }







