
class Matrix {
    int [][] matrix;
    int rows;
    int cols;
    Matrix(String matrixAsString) {
        String[] lines = matrixAsString.trim().split("\n");
        rows = lines.length;
        cols = lines[0].trim().split("\\s+").length;
        matrix = new int[rows][cols];
        
          for(int i = 0; i < rows; i++) {
              String[] parts = lines[i].trim().split("\\s+");
              for(int j = 0; j < cols; j++) {
                      matrix[i][j]= Integer.parseInt(parts[j]);
              }
          }
    }

    int[] getRow(int rowNumber) {
       return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
       int[] col = new int[rows];

        for (int i = 0; i < rows; i++) {
            col[i] = matrix[i][columnNumber - 1];
        }

        return col;
    }
}
