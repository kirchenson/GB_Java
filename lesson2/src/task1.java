//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class task1 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{7, 2, 4, 8, 5, 1};

        for (int out = arr.length - 1; out >= 1; out--) {
            for (int i = 0; i < out; i++) {
                if (arr[i] > arr[i + 1]) {
                    int d = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = d;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}