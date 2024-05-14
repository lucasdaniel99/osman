public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setNumbers(int[] numbers) {
        model.setNumbers(numbers);
    }

    public void displayNumbers() {
        int[] numbers = model.getNumbers();
        view.displayNumbers(numbers);
    }

    public void sortNumbers() {
        int[] numbers = model.getNumbers();
        bubbleSort(numbers);
        view.displaySortedNumbers(numbers);
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // troca arr[j+1] e arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}