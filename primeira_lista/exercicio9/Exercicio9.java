package exercicio9;

class Main {
    public static void main(String[] args) {
        int[] arr = {-10, -20, 2, 3, 1, 10};
        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        SortMachine sortMachine = new SortMachine(arr, quickSort);
        sortMachine.runSort();

        for(int element : sortMachine.getArr()) {
            System.out.println(element);
        }
    }
}