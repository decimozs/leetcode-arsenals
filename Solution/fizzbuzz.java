import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        // iterate over the given number.
        for (int i = 1; i <= n; i++) {
            // if the iteration index is divisible by 15 then it will print fizzbuzz
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            // if the iteration index is divisible by 3 then it will print fizz
            } else if (i % 3 == 0) {
                list.add("Fizz");
            // if the iteration index is divisible by 5 then it will print buzz
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } 
            // hence print the iteration index
            else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}