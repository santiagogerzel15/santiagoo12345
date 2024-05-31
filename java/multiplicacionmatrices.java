public class multiplicacionmatrices {
    public static void main(String[] args) {
        // Definir las matrices
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz2 = {{7, 8}, {9, 10}, {11, 12}};

        // Obtener las dimensiones de las matrices
        int filasMatriz1 = matriz1.length;
        int columnasMatriz1 = matriz1[0].length;
        int filasMatriz2 = matriz2.length;
        int columnasMatriz2 = matriz2[0].length;

        // Verificar si las matrices se pueden multiplicar
        if (columnasMatriz1 != filasMatriz2) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            return;
        }

        // Crear una matriz para almacenar el resultado de la multiplicación
        int[][] resultado = new int[filasMatriz1][columnasMatriz2];

        // Calcular la multiplicación de matrices
        for (int i = 0; i < filasMatriz1; i++) {
            for (int j = 0; j < columnasMatriz2; j++) {
                for (int k = 0; k < columnasMatriz1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Imprimir la matriz resultado
        System.out.println("Resultado de la multiplicación:");
        for (int i = 0; i < filasMatriz1; i++) {
            for (int j = 0; j < columnasMatriz2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}



