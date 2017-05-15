package com.AE.Stack;

/**
 * Created by Angel on 5/9/17.
 */
public class Stack {
    private int maxSize; //using array
    private long[] stackArray;
    private int top;

    public Stack(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j)
    {
        stackArray[++top] = j; // increment top, before...
    }

    public long pop()
    {
    return stackArray[top--]; //decrement top, after ...
    }

    public long peak()
    {
        try{
            return stackArray[top];
        }catch(IndexOutOfBoundsException e){
            System.out.println("the Stack is empty");
        }
        return -1;
    }

    public boolean isEmpty() //true if stack is empty since return is -1
    {
        return (top == -1);
    }

    public boolean isFull() //true if stack if full
    {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        System.out.println(theStack.peak());

        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }

        System.out.println(" ");
        System.out.println(theStack.isEmpty());
        theStack.peak();
        System.out.println(theStack.isFull());
    }
}



