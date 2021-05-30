import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}

class GFG{
        
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
        
        public static void main(String args[]) throws IOException { 
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                while(t > 0){
        	        int n = sc.nextInt();
                        Node head = new Node(sc.nextInt());
                        Node tail = head;
                        for(int i=0; i<n-1; i++)
                        {
                                tail.next = new Node(sc.nextInt());
                                tail = tail.next;
                        }
                        Solution g = new Solution();
                        int ans = g.getMiddle(head);
                        System.out.println(ans);
                        t--;
                }
        }
        
}

class Solution{
    
    int getMiddle(Node head){
         
        int length = 0;
        Node iterator = head;
        while(iterator != null){
             length++;
             iterator = iterator.next;
        }
         
        iterator = head;
        int middleElement = -1;
        int currentPosition = 1;
        int middleElementPosition = (length/2)+1;
        while(iterator != null){
            if(currentPosition == middleElementPosition){
                middleElement = iterator.data;
                break;
            }
            currentPosition++;
            iterator = iterator.next;
        }
        return middleElement;
        
    }
    
}
