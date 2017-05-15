package com.AE.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Angel on 5/9/17.
 */
public class StackChar {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackChar(int max) { //constructor
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;

    }

    public void push(char j) { //put item on top of stack .. before
        stackArray[++top] = j;
    }

    public char pop() { //pop off stack ... after
        return stackArray[top--];
    }

    public boolean peek() { //check to see the top value
        try{
            System.out.println(stackArray[top]);
            return true;

        }catch (IndexOutOfBoundsException e){
            System.out.println("Stack is full");
        }
      return false;
    }

   public boolean isEmpty(){ //check stack is empty
        return (top == -1);
   }
    public static String getString() throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }




}

