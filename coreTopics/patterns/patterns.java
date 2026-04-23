package coreTopics.patterns;

public class patterns {
    
    
    public static void star() {
        for (int line = 1; line <=4 ; line ++) {
            for (int star = 1; star <= line ; star++) {
                System.out.print("*");
            }
            System.out.println();
          }
    }

    public static void invertedStar() {
        int n = 5;
        for (int i = 1; i<=n; i++) {
            for(int j = 1; j < n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HalfPyramid() {
        for(int i = 1; i <= 10 ; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void charracterPattern() {
        int n = 5;
        char ch = 'A';
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
   
   
    public static void main(String[] args) {
        // star();
        // invertedStar();
        // HalfPyramid();
        charracterPattern();

    }
    }

