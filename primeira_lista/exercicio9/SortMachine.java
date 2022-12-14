package exercicio9;

public class SortMachine {
    private SortingAlgorithm sortingAlgoritm;
    private int[] arr;

    public SortMachine(int[] arr, SortingAlgorithm selectedSortingAlgoritm) {
        this.arr = arr;
        this.sortingAlgoritm = selectedSortingAlgoritm;
    }

    public int[] getArr() {
        return arr;
    }

    void runSort() {
        this.sortingAlgoritm.runSort(arr);
    }
}
