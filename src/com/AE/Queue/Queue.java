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

public void insert(long j) {
    if(rear == maxSize-1){
        rear = -1;
        queArray[++rear] = j;
        nItems++;
    }

    
}
}
