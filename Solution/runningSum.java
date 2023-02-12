class solution {
    public int[] runningSum(int[] nums) {
        // declare an array of answers for the output
        int[] answer = new int[nums.length];
        // declare a starting point for the answers
        answer[0] = nums[0];

        // loop trough the array of nums
        for (int i = 1; i < nums.length; i++) {
            // answer will be the sum of the current index to the next index
            answer[i] = answer[i - 1] + nums[i];
        }
        return answer;
    }
}
