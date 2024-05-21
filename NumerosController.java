public class NumerosController {
    private NumerosModel model;
    private View View;

    public NumerosController(NumerosModel model, View view) {
        this.model = model;
        this.View = view;
    }

    public void setNumero(int index, int numero) {
        model.setNumero(index, numero);
    }

    public void ordenarNumerosInsertionSort() {
        int[] numeros = model.getNumeros();
        int n = numeros.length;
        for (int i = 1; i < n; ++i) {
            int key = numeros[i];
            int j = i - 1;
            while (j >= 0 && numeros[j] > key) {
                numeros[j + 1] = numeros[j];
                j = j - 1;
            }
            numeros[j + 1] = key;
        }
        View.exibirNumeros(numeros);
    }

    public void ordenarNumerosBubbleSort() {
        int[] numeros = model.getNumeros();
        int n = numeros.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
        View.exibirNumeros(numeros);
    }
}