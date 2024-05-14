import java.util.Arrays;

public class View {
    public void displayNumbers(int[] numbers) {
        System.out.println("Números armazenados: " + Arrays.toString(numbers));
    }

    public void displaySortedNumbers(int[] numbers) {
        System.out.println("Números ordenados: " + Arrays.toString(numbers));
    }
}