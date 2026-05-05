import java.util.*;


public class arrays {

   //Linear Search Algorithm
   public static int LinearScarch(int numbers[], int key) {
          for(int i =0; i <= numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
          }

          return -1;
   }

  

  //Largest and Smallest Element in an Array

  public static int Largest(int numbers[]) {
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for(int i = 0; i< numbers.length; i++) {
        if(numbers[i] > largest) {
            largest = numbers[i];
        }
        
    }
    return largest;
   
  }

  // Binary Search Algorithm

  public static int BinaryScarch(int numbers[], int key) {
     int start = 0;
     int end = numbers.length - 1;

     while(start <= end) {
        int mid = start + end / 2;

        if(numbers[mid] ==key) {
            return mid;
        } else if(numbers[mid] <key) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
     }
     return -1;
  }

  // Reverse an Array

  public static void Reverse(int numbers[]) {
    int frist = 0;
    int last = numbers.length - 1;

    while(frist < last) {
        int temp = numbers[frist];
        numbers[frist] = numbers[last];
        numbers[last] = temp;
        frist++;
        last--;
    }
  }



  //Pairs in array
  public static void Print_pairs(int numbers[]) {
    for(int i =0; i < numbers.length; i++) {
        int curr = numbers[i];
        for(int j = i + 1; j < numbers.length; j++) {
            System.out.print("(" + curr + "," + numbers[j] + ")");
        }
        System.out.println();
    }
    
  }

  //print subarrays
  public static void Print_Subarrays(int numbers[]) {
    for(int i = 0; i < numbers.length; i ++) {
        for(int j = i; j < numbers.length; j++) {
            for (int k = i; k <= j; k++) {
                System.out.print(numbers[k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
  }
  

    // main function
    public static void main(String[] args) {
         int numbers[] = {2, 4, 6, 7, 8, 9, 10, 12, 16};
            // int key = 7;

            // int index = LinearScarch(numbers, key);

            // if(index == -1) {
            //     System.out.println("Element not found in the array.");
            // } else {
            //     System.out.println("Element found at index: " + index);
            // }

                // int largest = Largest(numbers);
                // System.out.println("Largest element in the array: " + largest);

                
                // int index = BinaryScarch(numbers, key);
                // if(index == -1) {
                //     System.out.println("Element not found in the array.");
                // } else {
                //     System.out.println("Element found at index: " + index);
                // }

                // Reverse(numbers);
                // for(int i = 0; i < numbers.length; i++) {
                //     System.out.print(numbers[i] + " ");
                // }
                // System.out.println();

                // Print_pairs(numbers);

                Print_Subarrays(numbers);
    }
}
