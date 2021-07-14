package StackAndQueue;

public class MaxStack {


        Stack<Integer> stack = new Stack<>();
        Stack<Integer> max = new Stack<>();


    public void push(int x) {
        stack.push(x);
        max.push(max.isEmpty() ? x : Math.max(x, max.peek()));

    }

    public int pop() {
        max.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return max.peek();
    }

    public int popMax() {
        int num = max.peek();
        Stack<Integer> temp = new Stack<>();
        while (stack.peek() != num) {
            temp.push(stack.pop());
            max.pop();
        }
        max.pop();
        stack.pop();
        while (!temp.isEmpty()) {
            push(temp.pop());
        }
        return num;
    }
}
