  public class Bit {


    public static void OddEven(int n) {
        int Bitcompare = 1; 
        if( (n  & Bitcompare) == 0 ) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static int getithBit(int n , int i) {
        int bitmask = 1 << i;

    if((bitmask & n) == 0) {
        return 0;
    }else {
        return 1;
    }

    }

    public static int setithbit(int n , int i) {
        int bitmask = 1 << i;

        return n | bitmask;
    }

    public static int clearithbit(int n , int i ) {
        int bitmask = ~(1 << i);

        return n & bitmask;
    }

    public static int updateithbit(int n , int i, int newBit) {
        if(newBit == 0 ) {
           return   clearithbit(n , i);
        } else {
           return   setithbit(n , i);
        }
    }

    public static int clearlastithbit(int n , int i) {
        int bitmask = (~0) << i;
          
          return n & bitmask;
    }

    public static int clearrangebits(int n , int i , int j) {
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;

        int bitmask = a | b;

        return n & bitmask;
    }

    public static boolean ispoweroftwo(int n) {
        return (n & (n - 1)) == 0;
    }

    //count setBits  (Google , amazon)

    public static int countsetbits(int n) {
        int count = 0;
         
         while(n > 0) {
            if((n & 1) != 0) {
                count++;
            }
            n  = n >> 1;
         }

         return count;
    }


    public static int fastExpo( int a , int n) {
        int ans = 1;

        while(n > 0) {
            if((n & 1) != 0) {
                ans = ans * a;

            }

            a = a * a;
            n = n >> 1;
        }

        return ans;
    }

   public static void swap(int x , int y) {

    System.out.println("before swapping :" + x + " " + y);

    x = x ^ y;
    y = x ^ y;
    x = x ^ y;


System.out.println("after swapping :" + " " + x + " " + y); 
   }

    public static void main(String[] args) {
        // int n  = 00010101;
        // OddEven(n);

        // System.out.println(getithBit(10, 2));

        // System.out.println(setithbit(10, 2));

        // System.out.println(clearithbit(10, 1));

        // System.out.println(updateithbit(10, 2, 1));

    //    System.out.println(clearlastithbit(15, 2));

    //    System.out.println(clearrangebits(10, 2, 4));

          

        //   System.out.println(countsetbits(10));

        // System.out.println(fastExpo(3, 5));

        swap(5, 6);
    }
  }