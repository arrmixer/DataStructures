package com.AE.Graphs;



/**
 * Created by Angel on 5/13/17.
 */
class Vertex {
    String name;
    BetterGraph.Node adjList;
    Vertex(String name, BetterGraph.Node aNode){
        this.name = name;
        this.adjList = aNode;
    }
}
