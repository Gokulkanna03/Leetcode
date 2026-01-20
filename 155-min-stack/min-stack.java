class MinStack {
    Stack<Integer> stack = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();  
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int a : stack) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }
}
