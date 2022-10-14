import java.util.ArrayList;
import java.util.List;

public class leetCode_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 8, 5, 7, 7, 8};
        System.out.println(missingNum(arr));
    }

    static List<Integer> missingNum(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                selectionSort.swap(arr, i, correct);
            } else i++;

        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                list.add(j + 1);
            }
        }
        return list;
    }
}
