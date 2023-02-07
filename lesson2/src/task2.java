
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2 {
    public static void main(String[] args) throws IOException {
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

        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        String logging = String.valueOf(a) + option + String.valueOf(b) + "=" + String.valueOf(res);
        logger.info(logging);

    }
}
