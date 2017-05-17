package linkedList;

public class LinkedListDemo 
{
	
	protected Node head;
	protected Node tail;
	public int size;
	
	public LinkedListDemo()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void insert(int nextInt) 
	{
		Node node = new Node(nextInt,null);
		size++;
		
		if(head == null)
		{
			head = node;
			tail = head;
		}
		
		else
		{
			tail.setLink(node);
			tail = node;
		}
		
	}

	public void delete() 
	{
		
		if(tail == null)
		{
			System.out.println("Empty List Deletion not possible");
			return;
		}
		
		if(head == tail)
		{
			head = null;
			tail = null;
			size = 0;
			return;
		}
		
		
		Node s = head;
		Node t = head;
		
		while(s != tail)
		{
			t = s;
			s = s.getLink();
		}
		
		tail = t;
		tail.setLink(null);
		size--;
		return;
	}

	public void deleteAll(int nextInt) 
	{
		int count=1;
		
		if(head == null)
		{
			System.out.println("List is empty cannot perform action");
			return;
		}
		else 
		{
			
			if(tail.getData()>nextInt)
			{
				delete();
			}
			
			Node s = head;
			Node t = head;
			
			while(s != tail)
			{
				t = s;
				
				System.out.println(t.getData() +">"+nextInt);
				if(t.getData() > nextInt)
				{
					deleteAtPos(count);
				}	
				s = s.getLink();
				count++;
			}
			if(s.getData()>nextInt)
			{
				delete();
			}
		}
		
	}
	
	public void deleteAtPos(int pos)
	{
		if(head == null)
		{
			System.out.println("List empty Cannot perform action");
			return;
		}
		if(pos == 1)
		{
			head = head.getLink();
			size--;
			return;
		}
		
		if(pos == size)
		{
			Node s = head;
            Node t = head;
            while (s != tail)
            {
                t = s;
                s = s.getLink();
            }
            tail = t;
            tail.setLink(null);
            size --;
            return;
		}
		
		Node ptr = head;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size-- ;
        return;
	}
	
	
	public void display() 
	{
		
		System.out.println("*********Singly Link List**********");
		
		if(size == 0)
		{
			System.out.println("List is empty");
			return;
		}
		
		if(head.getLink()==null)
		{
			System.out.println(head.getData());
			return;
		}
		
		Node temp = head;
		System.out.print(head.getData()+" -> ");
		temp = head.getLink();
		
		while(temp.getLink() != null)
		{
			System.out.print(temp.getData()+" -> ");
			temp = temp.getLink();
		}
		System.out.println(temp.getData()+"\n");

		
	}

}
