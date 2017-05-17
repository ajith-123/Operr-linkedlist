package linkedList;
import java.util.*;
import java.io.*;

public class SinglyLinkedList 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		LinkedListDemo list = new LinkedListDemo(); //Creating Object of class LinkedListDemo
		
		System.out.println("Singly Linked List");
		
		
		for(;;)
		{
			System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. append an element");
            System.out.println("2. remove the tail element");
            System.out.println("3. remove all elements greater than target value");
            System.out.println("4. Display List");
            System.out.println("5. exit");
                        
            int choice = sc.nextInt(); 
            
            switch(choice)
            {
            case 1: 
            	System.out.println("Enter an integer element to be inserted");
            	list.insert(sc.nextInt());
            	list.display();
            	break;
            
            case 2:
            	list.delete();
            	list.display();
            	break;
            	
            case 3:
            	System.out.println("Enter the target value");
            	System.out.println("All elements greater than the target value will be deleted");
            	list.deleteAll(sc.nextInt());
            	break;
            
            case 4:
            	list.display();
            	break;
            	
            case 5:
            	System.out.println("Terminating the program");
            	System.out.println("Bye");
            	System.exit(0);
            	          	
            default:
            	System.out.println("Please Enter a choice from the list given");
            }
            
                                   
            	
            
		}
		
		
	}
}
