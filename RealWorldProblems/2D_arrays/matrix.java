public class matrix {

    public static void cctvHeatMapScanner(int[][] matrix) {
    int mostHeat = Integer.MIN_VALUE;
    int heatRow = -1;   
    int heatCol = -1;   

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] > mostHeat) {
                mostHeat = matrix[i][j];
                heatRow = i;    
                heatCol = j;
            }
        }
    }

    System.out.println("Most heated area: " + mostHeat  + " at location: [" + heatRow + "][" + heatCol + "]");
}

//flood Risk detector 

  public static void floodRiskdetector(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            sum += matrix[i][j];
        }
    }
    double average = (double) sum / (matrix.length * matrix[0].length);

    System.out.println("Average water level: " + average);
    System.out.println("High flood risk locations:");

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] < average) {
                System.out.println("(" + i + "," + j + ")"); 
            }
        }
    }
}



 
    public static void main (String[] args) {
        int matrix[][] ={
               {4, 5, 3},
               {2, 1, 6},
               {7, 2, 5}
        };
        // cctvHeatMapScanner(matrix);
        floodRiskdetector(matrix);
    }
}