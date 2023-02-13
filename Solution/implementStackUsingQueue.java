import java.util.LinkedList;
import java.util.Queue;

class solution {

    private Queue<Integer> queue = new LinkedList<>();

    public MyStack() {

    }

    // basically, this will push the data element in the top just like how stack works
    public void push (int x) {
        queue.add(x);
        // iterate over the data structure
        for(int i = 1; i < queue.size(); i++) {
            // push the data
            queue.add(queue.poll());
        }
    }

    // just how stack works, we should pop the recent date elements in the data structure
    public int pop() {
        return queue.remove();
    }

    // just how stack works, we should peek at the top element of the stack
    public int top() {
        return queue.peek();
    }

    // just what structure have, we should return a boolean value if the structure is empty or not
    public boolean empty() {
        return queue.isEmpty();
    }

}