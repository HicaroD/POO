package exercicio9;

public class BubbleSort implements SortingAlgorithm {

    @Override
    public void runSort(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
    }

}
