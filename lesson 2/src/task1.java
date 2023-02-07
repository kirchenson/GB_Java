import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class task1 {
    public static void main(String[] args) throws IOException {
        int[] arr;
        arr = new int[]{7, 2, 4, 8, 5, 1};
        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("log2.1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(arr));
        for (int out = arr.length - 1; out >= 1; out--) {
            for (int i = 0; i < out; i++) {
                if (arr[i] > arr[i + 1]) {
                    int d = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = d;
                    sb.append(Arrays.toString(arr));
                }
            }
        }
        logger.info(String.valueOf(sb));
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}