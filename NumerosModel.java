public class NumerosModel {
    private int[] numeros = new int[10];

    public void setNumero(int index, int numero) {
        numeros[index] = numero;
    }

    public int[] getNumeros() {
        return numeros;
    }
}