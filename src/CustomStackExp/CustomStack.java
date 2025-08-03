package CustomStackExp;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        //if there is no size provided pass DEFAULT_SIZE to the constructor which has one argument
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        //allocating memory for data array basically stack of size
        this.data = new int[size];
    }

    public boolean push(int item) {
//  if stack is full then can't add
        if (isFull()) {
            System.out.println("Stack is full!!!!!!");
            return false;
        }

        ptr++;//increase the pointer
        data[ptr] = item;//add the item
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot remove item from empty stack");
        }
//        int removed=data[ptr];
//        ptr--;
//        return removed;

        return data[ptr--];

    }

    //Peek means look at the top element in Stack and return it without removing it from stack
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty can't find top element");
        }
        return data[ptr];
    }

    public void printStack() {
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + ", ");
        }
    }
    private boolean isFull() {
        return ptr == data.length - 1;//pointer is at last index
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

}
