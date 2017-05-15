package com.AE.BracketChecker;

/**
 * Created by Angel on 5/9/17.
 */

// stacks used  to check matching brackets
public class StackBrackets {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackBrackets(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j; // add to stack before..
    }

    public char pop() {
        return stackArray[top--]; // take off stack after...
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }


}


