public class Main {
    public static void main(String[] args) {
        NumerosModel model = new NumerosModel();
        View View = new View();
        NumerosController controller = new NumerosController(model, View);

        // Adicionando números
        controller.setNumero(0, 5);
        controller.setNumero(1, 2);
        controller.setNumero(2, 7);
        controller.setNumero(3, 1);
        controller.setNumero(4, 10);
        controller.setNumero(5, 3);
        controller.setNumero(6, 6);
        controller.setNumero(7, 8);
        controller.setNumero(8, 4);
        controller.setNumero(9, 9);

        // Ordenando e exibindo com Insertion Sort
        controller.ordenarNumerosInsertionSort();

        // Ordenando e exibindo com Bubble Sort
        controller.ordenarNumerosBubbleSort();
    }
}