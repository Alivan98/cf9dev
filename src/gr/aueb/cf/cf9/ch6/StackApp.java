package gr.aueb.cf.cf9.ch6;

/**
 * Υλοποιεί μία λογική Last - in - First - Out (LIFO)
 */

public class StackApp {
    static int[] stack = new int [10];
    static int top = -1;

    public static void main(String[] args) {
        int num = 0;
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);

        printStack();
        num = pop();
        System.out.println("Popped: " + num);
        System.out.println();
        printStack();
    }

    public static void push(int num) {
        if(isFull()) {
            System.err.println();
        }
        top++;
        stack[top] = num;
        // stack[++top] = num;
    }

    public static int pop() {
        if (isEmpty()) {
            System.err.println();
        }
        int num = stack[top];
        top--;
        return num;
        // return stack[top--];
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == stack.length -1;
    }

    public static void printStack() {
        if(isEmpty()) {
            throw new RuntimeException("stack is empty!");
        }
        for(int i = top; i >= 0; i--) {
            System.out.println();
        }
    }
}