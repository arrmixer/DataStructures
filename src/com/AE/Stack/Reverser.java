package com.AE.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Angel on 5/9/17.
 */
public class Reverser { //reverses the stack to print out in order
    private String input;           //input string
    private String output;          //output string

    public Reverser(String in){ //constructor
        input = in;
    }

    public String doRev()       //reverse the string
    {
        int stackSize = input.length();  //get max stack size
        StackChar theStack2 = new StackChar(stackSize);

        for(int j=0;j<input.length();j++){
            char ch = input.charAt(j);  //get the char from the input string
            theStack2.push(ch);         //push it into the Stack
        }

        output = "";
        while (!theStack2.isEmpty()){
            char ch = theStack2.pop();  //pop the char
            output = output + ch;
        }

        return output;  // return the reverse Stack of characters
    }

    public static void main(String[] args) throws Exception {
      String input, output;
      while(true){
          System.out.println("Enter a string: ");
          System.out.flush();
          input = StackChar.getString(); //read the string
          if(input.equals("")) break; // program terminates with no input
          Reverser theReverser = new Reverser(input);
          output = theReverser.doRev();
          System.out.println("Reversed: " + output);
      }

}



}

