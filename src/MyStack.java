public class MyStack {
    int[] arr;
    int size;
    int index;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
        index = 0;
    }

    public void push(int element) {
        if (index == size) {
            throw new StackOverflowError("Stack is full");
        } else {
            arr[index++] = element;
        }
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    private boolean isEmpty() {
        return index == 0;
    }

    public int size() {
        return index;
    }

    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.print("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());

    }

}
