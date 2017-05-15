package com.AE.Queue;

/**
 * Created by Angel on 5/15/17.
 */
public class Queue2App {
    public static void main(String[] args) {
        Queue2 theQueue2 = new Queue2(5);

        theQueue2.insert(10);
        theQueue2.insert(20);
        theQueue2.insert(30);
        theQueue2.insert(40);

        theQueue2.remove();
        theQueue2.remove();
        theQueue2.remove();
        theQueue2.remove();

        System.out.println(theQueue2.isEmpty());
        System.out.println(theQueue2.peek());

        theQueue2.insert(50);    // insert 4 more items
        theQueue2.insert(60);        // (wraps around)
        theQueue2.insert(70);
        theQueue2.insert(80);

        while (!theQueue2.isEmpty()) {  // remove and display all items
            long n = theQueue2.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}


