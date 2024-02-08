package analiz;

public class Analizador {
    public int[] acha_sequencia(double[] probs, int[] valores) {
        int tamanho = valores.length;
        int[] indices = new int[tamanho];
    
        for (int i = 0; i < tamanho; i++) {
            indices[i] = i;
        }

        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                double valorI = valores[indices[i]] * probs[indices[i]] * probs[indices[i]];
                double valorJ = valores[indices[j]] * probs[indices[j]] * probs[indices[j]];

                if (valorJ > valorI) {
                   
                    int temp = indices[i];
                    indices[i] = indices[j];
                    indices[j] = temp;
                }
            }
        }

        return indices;
    }
}