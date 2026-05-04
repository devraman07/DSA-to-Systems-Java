package coreTopics.advancepatterns;  


public class patterns {
      
      public static void HollowRectangle(int rows, int cols) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                if(i == 1 || i == rows || j == 1 || j ==cols) {
                    System.out.print( "*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      }


      public static void inverted_rotated_half_pyramid(int n) {
        for(int i =1; i <= n; i++) {
            for(int j =1; j <= n - i ; j++) {
                System.out.print(" ");
            }
            for(int j =1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
      }

      public static void inverted_half_pyramid_with_numbers(int n) {
        for(int i =1; i<=n; i++) {
            for(int j =1; j<= n-i +1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
      }

      public static void Floyds_triangle(int n) {
        int counter = 1;

        for(int i = 1; i<= n ; i++) {
            for(int j =1; j<= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
      }

      public static void zero_one_triangle(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i + j ) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
      }

      public static void Butterfly(int n ) {
        for(int i = 1; i <= n ; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j =1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j =1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      }

      public static void solid_rhumbus(int n) {
        for(int i = 1; i <= n ; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      }

      public static void hollow_rhumbus(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j =1; j <= n -i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      }

      public static void solid_diamond(int n) {
        for(int i =1; i <= n; i++) {
            for(int j =1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--) {
            for(int j =1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      }
      
      public static void main(String[] args) {
        HollowRectangle(5, 5);
        inverted_rotated_half_pyramid(5);
        inverted_half_pyramid_with_numbers(5);
        Floyds_triangle(5);
        zero_one_triangle(5);
        Butterfly(5);
        solid_rhumbus(5);
        hollow_rhumbus(5);
        solid_diamond(5);
      }
}