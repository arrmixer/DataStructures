package com.AE.Graphs;

import com.AE.singlylinkedlist.SinglyLinkedList;

import java.util.ArrayList;

/**
 * Created by Angel on 5/9/17.
 */
public class Graph {
   private int vCount;  //number of vertices
   private int eCount;  //Number of edges


    private ArrayList<Integer>[] adjacents;

    public Graph(int vCount){
        this.vCount = vCount;
        this.eCount = 0;
        adjacents = new ArrayList [vCount];

        for(int i = 0;i < vCount; i++){
            adjacents[i] = new ArrayList<Integer>();
        }
    }

    public int getVetexCount(){
        return vCount;
    }

    public int getEdgeCount(){
        return eCount;
    }

    public void addEdge(int src, int dest){
        adjacents[src].add(dest);
        eCount++;
    }

    public Object[] adj(int src){
        return adjacents[src].toArray();
    }
}
