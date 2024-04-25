package com.learn.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

	public boolean addVertex(String vertex){
	    
	    if(adjList.get(vertex)!=null){
	       return false;
	    }
	    else{
	    	ArrayList<String> list = new ArrayList<>();
	        adjList.put(vertex,list);
	        return true;
	    }
	    
	}
}