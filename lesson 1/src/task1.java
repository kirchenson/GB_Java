//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("n: ");
        Integer n = iScanner.nextInt();
        int x1 = 0;
        int x2 = 1;
        for (int i = 1; i <= n; i++) {
            x1 = x1 + i;
            x2 = x2 * i;
        }
        System.out.printf("сумма n : %d \n", x1);
        System.out.printf("произведение n : %d", x2);
    }
}
