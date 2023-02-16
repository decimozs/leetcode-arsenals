class solution {
    public int[] runningSum(int[] nums) {
        // declare an array of answers for the output
        int[] answers = new int[nums.length];

        // declare a starting point for the answers
        answers[0] = nums[0];

        // loop trough the array of nums
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            answers[i] = nums[i - 1] + nums[i];
        }
        
        // answer will be the sum of the current index to the next index
        return answers;  
      }
}
