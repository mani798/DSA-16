package DSA16;
import java.util.*;
import java.io.*;
public class Mergetosortedlist {
	 static class Node
	    {
	        int data;
	        Node next;
	        
	        Node(int num)
	        {
	            data = num;
	            next = null;
	        }
	    };
	    
	    
	    static Node insert(Node head,int data)
	    {
	        if(head == null)
	            head = new Node(data);
	        else
	        {
	            Node temp = head;
	            while(temp.next != null)
	            temp = temp.next;
	            
	            temp.next = new Node(data);
	        }
	        
	        return head;
	    }
	    
	    
	    static void print(Node head)
	    {
	        if(head != null)
	        {
	            System.out.print(head.data + " ");
	            print(head.next);
	        }
	    }
	    
	    
	    static Node sortedMerge(Node x,Node y)
	    {
	        if(x == null)
	        return y;
	        
	        if(y == null)
	        return x;
	        
	        if(x.data < y.data)
	        {
	            x.next = sortedMerge(x.next,y);
	            return x;
	        }
	        else
	        {
	            y.next = sortedMerge(x,y.next);
	            return y;
	        }
	    }
	    
	 
	    public static void main (String[] args)
	    {
	        Node x = null, y = null;
	        
	    
	        x = insert(x,1);
	        x = insert(x,7);
	        x = insert(x,8);
	        x = insert(x,9);
	        System.out.print("First Linked List : ");
	        print(x);
	        
	        System.out.println();
	        
	       
	        y = insert(y,2);
	        y = insert(y,3);
	        y = insert(y,5);
	        y = insert(y,10);
	        y = insert(y,11);
	        System.out.print("Second Linked List : ");
	        print(y);
	        
	        System.out.println();
	        
	        
	        System.out.print("Merged Linked List in Sorted Order : ");
	        Node result = sortedMerge(x,y);
	        print(result);
	    }
}
