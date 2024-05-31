
    public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrizOriginal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;

        // Crear una nueva matriz para almacenar la transpuesta
        int[][] matrizTranspuesta = new int[columnas][filas];

        // Calcular la transpuesta de la matriz original
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // Imprimir la matriz transpuesta
        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}

