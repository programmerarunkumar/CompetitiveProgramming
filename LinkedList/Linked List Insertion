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
            Node head = null;
            for(int i=0; i<n; i++)
            {
                int value = sc.nextInt();
                int indicator = sc.nextInt();

                Solution ob = new Solution();
                if(indicator == 0)
                    head = ob.insertAtBeginning(head, value);
                else
                    head = ob.insertAtEnd(head, value);
            }
            printList(head); 
            t--;
        }
    } 
}

class Solution
{
    // No null check need for head node as we are inserting at the beginning.
    // Time complexity = O(1) as it does a constant amount of work.
    Node insertAtBeginning(Node head, int newValue)
    {
        Node newNode = new Node(newValue);
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    /* 
    Null check need for head node as we are inserting at the end.
    if head node is null make new node as head node
    else find the last node  and store the address of new node in last node
    */
    //Time complexity = O(n) Since there is a loop from head to end.
    Node insertAtEnd(Node head, int newValue)
    {
        Node newNode = new Node(newValue);
        newNode.next = null;
        
        while(head == null){
            head = newNode;
            return head;
        }
        
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        return head;
    }
}
