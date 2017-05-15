package com.AE.Queue;

/**
 * Created by Angel on 5/15/17.
 */
public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);    // insert 4 more items
        theQueue.insert(60);        // (wraps around)
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty()) {  // remove and display all items
            long n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
