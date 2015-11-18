package LinkedList;

public class ListNode<E> {
	
	private E item;
	private ListNode<E> next;
	
	public ListNode(E i)
	{
		item = i;
		next = null; //TODO is this right
	}
	
	public ListNode(E i, ListNode<E> n)
	{
		item = i;
		next = n;
	}
	
	public E getItem()
	{
		return item;
	}
	
	public ListNode<E> getNext()
	{
		return next;
	}
	
	public void setItem(E i)
	{
		item = i;
	}
	
	public void setNext(ListNode<E> n)
	{
		next = n;
	}
	
	/**
	 * @return string representation of the item in the ListNode
	 */
	public String toString()
	{
		String s = "item: " + item;
		
		return s;
	}

}
