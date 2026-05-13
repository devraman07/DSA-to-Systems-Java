

public class sorting {

   
   public static int BubbleSort(int arr[]) {
    for(int i = 0; i < arr.length -1 ; i ++) {
        for(int j = 0; j < arr.length - i -1; j++) {
            if(arr[j] > arr[j+1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    return 0; 
   }

   //selection sort
   public static int selectionSort(int arr[]) {
    for(int i = 0; i < arr.length -1 ; i++) {
        int smallest = i;
        for(int j = i +1; j < arr.length; j++) {
            if(arr[j] < arr[smallest]) {
                smallest = j;
            }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }
    return 0;
   }

   //insertion sort
   public static void insertionSort(int arr[]) {
     for(int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;
        while(j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
     }
   }

   //count sort
   public static void countSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i< arr.length; i++) {
        largest = Math.max(largest, arr[i]);
    }

    int count[] = new int[largest + 1];
     for(int i = 0; i <arr.length; i++) {
        count[arr[i]]++;
     }

     int j = 0;
     for(int i = 0; i< count.length; i++) {
        while(count[i] > 0) {
            arr[j] = i;
            j++;
            count[i]--;
        }
     }


   }

   public static int printArr(int arr[]) {
    for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
   System.out.println();
   return 0;
   }

    public static void main (String[] args) {
        int arr[] = {5, 1, 2, 5, 6,  2, 8, 1, 6, 9, 7,  3};
        // BubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countSort(arr);
        printArr(arr);
    }
}