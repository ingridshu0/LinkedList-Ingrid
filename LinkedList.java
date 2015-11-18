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
			for(int counter = 0; counter < index; counter++)
			{
				head = head.getNext();
				
				if(counter ==  index)
				{
					head.setNext(newNode);
					size++;
					
					if(index == size - 1)
					{
						tail = newNode;
					}
				}
			}
		}
		
	}

}
