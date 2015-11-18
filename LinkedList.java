package LinkedList;

public class LinkedList<E> /*implements Stack<E> && Queue<E>*/ {
	
	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;
	
	public LinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean add(E i)
	{
		add(size, i);
		
		if(tail.getNext() == i)
		{
			return true;
		}
		
		return false;
	}
	
	public void add(int index, E i)
	{
		ListNode<E> newNode = new ListNode<E>(i);
		
		if(index == 0)
		{
			head = new ListNode<E>(null, newNode);
			tail = new ListNode<E>(null, newNode);
			
			size++;
		}
		
		else
		{
			int counter = 0;
			
			for(ListNode<E> cur = head.getNext(); cur != null; cur = cur.getNext())
			{
				
				if(counter == index - 1)
				{
					newNode.setNext(cur.getNext());
					cur.setNext(newNode);
					size++;
					
					if(index == size - 1)
					{
						tail = newNode;
					}
				}
				counter++;
			}
		}
				
	}
	
	public String toString()
	{
		String s = "";
				
		for(ListNode<E> i = head.getNext(); i != null; i = i.getNext())
		{
			s += i.toString();
			s += ", ";
		}
		
		return s;
	}

}
