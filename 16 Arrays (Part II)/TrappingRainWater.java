public class TrappingRainWater {
    public static int trappedRainWater(int height[]) {
        int trappedWater = 0;
        int n = height.length;

        // Calculating leftMax boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]); 
        }

        // Calculating rightMax boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1]; // starting from right
        for (int i = n - 2; i >= 0; i--) { // n - 2 => 2nd last element
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // Calculating trappedWater
        for (int i = 0; i < n; i++) {
            // waterLevel = min (rightMax, leftmax) 
            int waterLevl = Math.min(rightMax[i], leftMax[i]);
            trappedWater += waterLevl - height[i];
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }
}
