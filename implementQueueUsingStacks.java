import java.util.*;

class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {

    }

    // add the data elements in the rear part of the queue
    public void push(int x) {
        stack1.add(x);
    }

    // pop the data elements from the front, with the help of convert function
    public int pop() {
        transferItems();
        return stack2.pop();
    }

    // used to transfer data elements from stack 1 to stack 2 for the pop and peek method
    private void transferItems() {
        if (stack2.isEmpty()) {
            // transfer the data elements
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
        }
    }

    // used to peek the data elements from the front of queue
    public int peek() {
        transferItems();
        return stack2.peek();
    }

    // check if both stack is empty or not
    // return true if it is empty
    // false if its not
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */