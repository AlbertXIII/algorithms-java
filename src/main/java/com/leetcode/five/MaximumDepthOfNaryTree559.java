package com.leetcode.five;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfNaryTree559 {

	public static void main(String[] args) {
		System.out.println();

	}
	
	static public int maxDepth(Node root) {
        if(root == null) return 0;
        
        int depth = 0;
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            for(int i = 0; i < queue.size(); i++){
                Node current = queue.poll();
                for(Node child: current.children){
                    queue.offer(child);
                }
            }
            depth++;
        }
        
        return depth;
        
    }
	
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	}

}
