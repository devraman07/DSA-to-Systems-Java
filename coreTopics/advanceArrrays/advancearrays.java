

public class advancearrays {

    //Max subarray sum brute force approach
    public static int MaxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for(int j = i; j <arr.length; j++) {
                currSum += arr[j];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }

    //Max subarray sum using prefix sum approach
    public static int MaxSubarraySumPrefix(int arr[]) {
        
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1; i <prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i =0; i < arr.length; i++) {
            int start = i;
            for(int j =i; j <arr.length; j++) {
                int end = j;
                int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }

    //Max subarray sum using kadane's algorithm
    public static int Kadens(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i =0; i <arr.length; i++) {
            cs = cs + arr[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        return ms;
    } 

    
    public static int Trappedwater(int height[]) {
         
         int n = height.length;
        //calcuate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i <n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);   
        }

        //calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n -2 ; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        //calculate trapped water
        int trappedWater = 0;
        for(int i = 0; i <= n - 1; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }


    //calculate max profit from stock buy and sell
    public static int MaxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i <= prices.length - 1; i++) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    } 

    /// find duplicate in an array
    public static boolean findDuplicate(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 4, 3, 2, 7};
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(MaxSubarraySum(arr));
        System.out.println(MaxSubarraySumPrefix(arr));
        System.out.println(Kadens(arr));
        System.out.println(Trappedwater(height));
        System.out.println(MaxProfit(prices));
        System.out.println(findDuplicate(arr));
    }
}