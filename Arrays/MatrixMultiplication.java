package Arrays;
public class MatrixMultiplication {
    public static int[][] multiplySparseMatrices(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;
        
        int[][] result = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                if (mat1[i][j] != 0) {
                    for (int l = 0; l < n; l++) {
                        if (mat2[j][l] != 0) {
                            result[i][l] += mat1[i][j] * mat2[j][l];
                        }
                    }
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int[][] mat1 = { {1, 0, 0}, {-1, 0, 3} };
        int[][] mat2 = { {7, 0, 0}, {0, 0, 0}, {0, 0, 1} };

        int[][] result = multiplySparseMatrices(mat1, mat2);
        
        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
