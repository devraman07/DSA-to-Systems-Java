

public class matrix {
 

 //find largest element in the matrix

 public static int FindLargest(int [][] matrix) {
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i< matrix.length; i++) {
        for(int j = 0; j < matrix[i].length; j++) {
            if(matrix[i][j] > largest) {
                largest = matrix[i][j];
            }
        }
    }
    return largest;
 }

 // find smallest element in the matrix

 public static int Findsmallest(int [][] matrix) {
    int smallest = Integer.MAX_VALUE;
    for(int i = 0; i< matrix.length; i++) {
        for(int j = 0; j < matrix[i].length; j++) {
            if(matrix[i][j] < smallest) {
                smallest = matrix[i][j];
            }
        }
    }
    return smallest;
 }

 // spiral matrix 

 public static void spiralMatrix(int [][] matrix) {
    int startRow = 0;
    int endRow = matrix.length - 1;
    int startCol = 0;   
    int endCol = matrix[0].length - 1;

    while(startRow <= endRow && startCol <= endCol) {
        for(int j = startCol; j <= endCol; j++) {
            System.out.print(matrix[startRow][j] + " ");
        }
        for(int i = startRow + 1; i <= endRow; i++) {
            System.out.print(matrix[i][endCol] + " ");
        }
        for(int j = endCol - 1; j >= startCol; j--) {
            if(startCol == endCol) {
                break;
            }
           System.out.print(matrix[endRow][j] + " ");
        } 
        for( int i = endRow - 1; i >= startRow + 1; i--) {
            System.out.print(matrix[i][startCol] + " ");
        }
        startRow++;
        endRow--;
        startCol++;
        endCol--;
    }
    System.out.println();
        
 }

 public static int diagonalSum(int[][] matrix) {
    int sum = 0;
    int n = matrix.length;

    for (int i = 0; i < n; i++) {
        
        sum += matrix[i][i];

        
        int antiCol = n - 1 - i;
        if (i != antiCol) {
            sum += matrix[i][antiCol];
        }
    }

    return sum;
}


public static void SearchSortedMatrix(int [][] matrix, int target) {
       int col = 0;
       int row = matrix.length - 1;

       while(row >= 0 && col < matrix[0].length) {
        if(matrix[row][col] == target) {
            System.out.println("Element found on index:" + row + " " + col);
            return;
        } else if(matrix[row][col] > target) {
            row--;
         } else {
            col++;
        }
       }
       System.out.println("Element not found in the matrix");
       }
       

       //find duplicate in the matrix

       public static void findDuplicate(int [][] matrix) {
        int count = 0;
          
           for(int i =0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 8) {
                    count++;
                }
            }
            if(count > 1) {
                System.out.println("Duplicate found in row " + i + ": " + count);
            }
        }
       }

     // sum 
     public static int sum(int [][] matrix) {
        int sum = 0;
         for(int j = 0; j < matrix[0].length; j++) {
            sum += matrix[1][j];
         }
         return sum;
     }

     //transpose of a matrix
     public static void transpose(int [][] matrix) {
        int [][] transposed = new int [matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        // Print the transposed matrix
        for(int i = 0; i < transposed.length; i++) {
            for(int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
     }

    public static void main(String[] args) {
        int [][] matrix = {
           {4, 7, 8},
           {8, 8, 7}
        };
        spiralMatrix(matrix);
        System.out.println("Largest element in the matrix is: " + FindLargest(matrix));
        System.out.println("Smallest element in the matrix is: " + Findsmallest(matrix));
        System.out.println("Sum of diagonal elements in the matrix is: " + diagonalSum(matrix));
        SearchSortedMatrix(matrix, 70);
        findDuplicate(matrix);
        System.out.println("Sum of elements in the row is: " + sum(matrix));
        transpose(matrix);   
    }
}