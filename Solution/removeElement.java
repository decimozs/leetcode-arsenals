class solution {
    public int removeElement(int[] nums, int val) {
        // int j = reference for the front of the array
        int j = 0;
        // loop trough the array of nums
        for (int i = 0; i <nums.length; i++) {
            // check if the iterating index of nums
            // if it is not eual
            if (nums[i] != val) {
                // then move the iterating index of nums with the current element into the front of array with the int j
                nums[j] = nums[i];
                // iterate
                j++;
            }
        }
        return j;
    }
}