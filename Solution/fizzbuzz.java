import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        // linear loop to the list
        for (int i = 1; i < n; i++) {
            // check if the index is divisible by 15, 3 and 5
            if (i % 15 == 0) {
                // then print
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                // then print
                list.add("Fizz");
            } else if (i % 5 == 0) {
                // then print
                list.add("Buzz");
            } else {
                // print all the value of index in the list while looping
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
        
}