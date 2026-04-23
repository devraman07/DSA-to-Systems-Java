package RealWorldProblems.patterns;

public class patterns {

    public static void ServerLoad() {
        int[][] load = {
                { 2, 4, 1, 3 },
                { 5, 1, 2, 4 },
                { 3, 3, 3, 2 }
        };

        for (int i = 0; i < load.length; i++) {
            for (int j = 0; j < load[i].length; j++) {
                if (load[i][j] <= 2) {
                    System.out.print(".");
                } else if (load[i][j] < 4) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ServerLoad();
    }
}