import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números:");

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        controller.setNumbers(numbers);

        System.out.println("Números digitados:");
        controller.displayNumbers();

        controller.sortNumbers();

        scanner.close();
    }
}