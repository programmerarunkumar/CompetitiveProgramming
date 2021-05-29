import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
    
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    System.out.println(obj.sum(head, k));
		}
	}
	
}

class Solution {
    
    public int sum(Node head, int k){
        
        int sumOfLastNNodes = 0;
        
        if(head == null){
            return sumOfLastNNodes;
        }
        
        int length = 0;
        Node iterator = head;
        while(iterator != null){
            length++;
            iterator = iterator.next;
        }
        
        iterator = head;
        while(iterator != null){
            if(length <= k){
             sumOfLastNNodes = sumOfLastNNodes + iterator.data;   
            }
            iterator = iterator.next;
            length--;
        }
        return sumOfLastNNodes;
     
    }
    
}

//Implemented Using Stack
class Solution1 {
    
    
    public int sum(Node head, int k){
        
        int sumOfLastNNodes = 0;
        
        if(head == null){
            return sumOfLastNNodes;
        }
        
        Node iterator = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(iterator != null){
            stack.push(iterator.data);
            iterator = iterator.next;
        }
        
        while(k > 0){
            sumOfLastNNodes = sumOfLastNNodes + stack.peek();
            stack.pop();
            k--;
        }
        return sumOfLastNNodes;
        
    }
    
}
