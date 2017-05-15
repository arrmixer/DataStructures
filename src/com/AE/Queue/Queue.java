package com.AE.Queue;

/**
 * Created by Angel on 5/11/17.
 */
public class Queue {
private int maxSize;
private long[] queArray;
private int front;
private int rear;
private int nItems;

public Queue(int s){
    maxSize =s;
    queArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
}

public void insert(long j) {  // put item at rear of queue
    if(rear == maxSize-1) rear = -1; //deal with wrap around
        queArray[++rear] = j;   // increment rear and insert
        nItems++;               // one more item

}

public long remove(){           // take item from front of queue
    long temp = queArray[front++];  // get value and increment front
    if(front == maxSize)
        front = 0;
        nItems--;                   // one less item
        return temp;
}

public long peekFront(){
    return queArray[front];
}

public boolean isEmpty(){   // true if queue is empty
    return (nItems == 0);
}

public boolean isFull(){   // true if queue is full
    return (nItems == maxSize);
}

public int size(){   // number of items in queue
    return nItems;
}
}
