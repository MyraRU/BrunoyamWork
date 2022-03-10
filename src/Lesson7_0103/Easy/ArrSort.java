package Lesson7_0103.Easy;


public class ArrSort {
    public boolean arrCheckSort() {

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1])
                return false;
        }
        return true;
    }
}
