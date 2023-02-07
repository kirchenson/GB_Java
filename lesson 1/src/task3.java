//Реализовать простой калькулятор
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        int res = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("операция: ");
        String option = iScanner.nextLine();
        System.out.print("a: ");
        Integer a = iScanner.nextInt();
        System.out.print("b: ");
        Integer b = iScanner.nextInt();

        switch (option) {
            case "+" -> res = a + b;
            case "-" -> res = a - b;
            case "*" -> res = a * b;
            case "/" -> res = a / b;
        }
        System.out.println(res);
    }
}
