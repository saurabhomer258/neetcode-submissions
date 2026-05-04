class MinStack {
    Stack<Integer> minStack; 
    Stack<Integer> stack;

    public MinStack() {
        minStack = new Stack();
        stack = new Stack();
    }
    
    public void push(int val) {
        if (minStack.size() == 0 || minStack.peek() >= val) {
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.size() >0) {
        Integer value = stack.peek();
        if( minStack.size() > 0 && value.equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
        }
    }
    
    public int top() {
        if(stack.size() == 0) {
            return 0;
        }
        else {
         return stack.peek();
        }
    }
    
    public int getMin() {
        if(minStack.size() == 0) {
                return 0;
        }
        return minStack.peek();
    }
}
