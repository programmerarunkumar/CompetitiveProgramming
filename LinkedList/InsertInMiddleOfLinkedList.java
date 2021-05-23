import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();   
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            
            //display(head);
            Solution obj = new Solution();
            obj.insertInMid(head, key);
            display(head);
            System.out.println();
        }
    }
    
    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}

class Solution {
    
    public Node insertInMid(Node head, int data){
        
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return head;
        }
        
        int size = sizeOfLinkedList(head);
        int insertPosition = (size % 2) == 0 ? (size/2) : (size/2)+1;
        
        Node prev = head;
        while(insertPosition > 1){
            prev = prev.next;
            insertPosition--;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        
        return head;
        
    }
    
    public int sizeOfLinkedList(Node head){
        
        int size = 0;
        Node iterator = head;
        while(iterator != null){
            iterator = iterator.next;
            size++;
        }
        return size;
        
    }
  
}
