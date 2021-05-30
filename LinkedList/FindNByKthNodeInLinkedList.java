import java.util.*;

class Node{
    
	int data;
    	Node next;
    
    	Node(int key){
        	data = key;
        	next = null;
    	}

}

class LinkedList{
    
    	static Node head;
    
	public static void addToTheLast(Node node) {
		if (head == null) 
		{
			head = node;
		} else {
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    	}
    
	public static void main (String[] args) {
        	Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		 
		while(t-- > 0){
			int n = sc.nextInt();
		    	int a1 = sc.nextInt();
		    	Node head = new Node(a1);
		    	addToTheLast(head);
		    	for(int i = 1; i < n; i++){
		        	int a = sc.nextInt(); 
				addToTheLast(new Node(a));
		    	}
			int k = sc.nextInt();
			GfG gfg = new GfG();
			System.out.println(gfg.nknode(head, k));
		}
		
	}
	
}

class GfG{
    
	public static int nknode(Node head, int k){
    
        	int length = 0;
        	Node iterator = head;
       		while(iterator != null){
            		iterator = iterator.next;
            		length++;
        	}
       
        	int nkNodeValue = -1;
        	int nkNodePosition = (length/k) + (length%k == 0 ? 0 : 1);
       
        	iterator = head;
        	int currentPosition = 1;
        	while(iterator != null){
            		if(currentPosition == nkNodePosition){
                		nkNodeValue = iterator.data;
                		break;
            		}
            		currentPosition++;
            		iterator = iterator.next;
        	}
        	return nkNodeValue;
        
    	}
    
}
