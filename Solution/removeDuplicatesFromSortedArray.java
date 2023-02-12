class Solution {
    public int removeDuplicates(int[] nums) {
        // for the iteration count
        int j = 0;

        // loop trough the array
        for (int i = 0; i < nums.length; i++) {
            // then check if the iteration index and current element is equal
            if (i < nums.length - 1 && nums[i] == nums[i + 1]){
                // if its equal then we will skip them and continue the iteration
                continue;
            }
            // then if the elements are not duplicate, then will continue to place the next element to the current element
            nums[j] = nums[i];
            j++;
        }
        return j;
    }
}