public class Arrays {
    // 1. Maximum Subarray Sum by Brut Force(Basic ) - time Comp = O(n3)
    public static void maxSubArraySum_brutForce(int array[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += array[k];
                }
                // System.out.println("current Sum:"+currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            // System.out.println("max:" + currSum);
        }
        System.out.println("max sum = " + maxSum);
    }

    // 
    public static void maxSubArraySum_PreFix(int array[]){
        int prefix[] = new int[array.length];
        prefix[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i-1] + array[i];
        }

        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int i = 0; i < prefix.length; i++) {
            for (int j = i; j < array.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum by preFix = " + maxSum);
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,-5};

        // 1. Maximum Subarray Sum by Brut Force(Basic ) - time Comp = O(n3)
        maxSubArraySum_brutForce(array);

        // 2. Maximum Subarray Sum by Pre Fix - time Comp = O(n2)
        maxSubArraySum_PreFix(array);

    }
}