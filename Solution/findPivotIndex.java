class solution {
    public int pivotIndex(int[] nums) {
        // declare a starting value for the total
        int total = 0;
        // loop trough the array of nums
        for (int i = 0; i < nums.length; i++) {
            // get the sum of array of nums
            total += nums[i];
        }

        // declare a starting value for the leftsum
        int leftSum = 0;
        // loop trough the array of nums again
        for (int i = 0; i < nums.length; i++) {
            // check if the leftsum is equal to the right sum
            if (leftSum == total - leftSum - nums[i]) {
                // return the index that we want to find in the index
                return i;
            }
            // get the sum
            leftSum += nums[i];
        }
        // return if no index
        return -1;
  }
}
