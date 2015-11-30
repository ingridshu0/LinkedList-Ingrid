/**
 * @author Ingrid Shu
 * 
 * Runner class for LinkedList / Queue / Stack
 */

package LinkedList;

// Stack<E> s = new LinkedList<E>(); for Stack and Queue and test pop, push, pull, offer etc.

public class LinkedListRunner {
	
	public static void main(String[] args)
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		System.out.println(l);
		
		System.out.println();
		
		
		// Copy constructor
		// ListNode<Integer> newNode;
		
		/*
		//remove(E o) WORKS
		System.out.println("REMOVE(E O)");
		l.remove(0); // item at first index
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.remove(3); // item at last index
		System.out.println(l);
		
		//l.remove(100); // item does not exist
		//System.out.println(l);
		*/
		
		/*
		//remove(int index) works
		System.out.println("REMOVE(INT INDEX)");
		Integer i = new Integer(5);
		System.out.println(l.remove(i));
		//System.out.println(l.removeLast());
		System.out.println(l);
		
		System.out.println(l.remove(2));
		System.out.println(l);
		
		System.out.println();
		
		//contains(E o) works
		System.out.println("CONTAINS(E OBJ)");
		System.out.println(l.contains(5));
		System.out.println(l.contains(7));
		
		System.out.println();
		
		//size()
		System.out.println("SIZE");
		System.out.println("Size:");
		System.out.println(l.size());
		
		System.out.println();

		/*
		//clear()
		l.clear();
		System.out.println(l.size());
		
		System.out.println();
		*/
		/*
		//get(int i) works
		System.out.println("GET(INT I)");
		System.out.println(l.get(1));
		//System.out.println(l.get(6)); // should throw IndexOutOfBoundsException();
		System.out.println(l.get(0)); // first index
		System.out.println(l);
		System.out.println(l.get(3)); // last index
		
		System.out.println();
		
		//set(int index) works
		System.out.println("SET(INT INDEX, E OBJ)");
		System.out.println(l.set(0, 100)); // first index
		System.out.println(l);
		
		System.out.println(l.set(1, 200));
		System.out.println(l);
		
		System.out.println(l.set(3, 500)); // last index
		System.out.println(l);
		
		
		//System.out.println(l.set(6, 0)); // index does not exist
		//System.out.println();
		

		System.out.println();

		//System.out.println(l);
		
		//indexOf(E o) 
		System.out.println("INDEXOF(E OBJ)");
		System.out.println(l.indexOf(100)); // first index // works
		System.out.println(l.indexOf(200)); 
		System.out.println(l.indexOf(500)); 
		//System.out.println(l.indexOf(111)); // index does not exist 
		
		System.out.println();
		
		//poll()
		System.out.println("POLL()");
		System.out.println(l.poll());
		
		System.out.println();
		
		//pop
		System.out.println("POP()");
		System.out.println(l.pop());
		
		System.out.println();
		
		//peek() works
		System.out.println("PEEK()");
		System.out.println(l.peek());
		
		LinkedList<Integer> l2 = new LinkedList<Integer>(); // empty list
		System.out.println(l2.peek());
		
		System.out.println();
		
		//isEmpty()
		System.out.println("ISEMPTY()");
		System.out.println(l.isEmpty());
		System.out.println(l2.isEmpty());
		*/
		System.out.println();
		
		System.out.println("ITERATOR()");
		System.out.println("l: " + l);
		String str = "";
		for(Integer node : l)
		{
			str += node;
			str += " ,";
		}
		System.out.println(str);
		
		System.out.println();
		
		System.out.println("\n" + "COPY CONSTRUCTOR");
		System.out.println("l: " + l);
		LinkedList<Integer> newL = l;
		System.out.println("newL: " + newL + "\n");
		
		//STACK
		System.out.println("STACK");
		Stack<Integer> st = new LinkedList<Integer>();
		
		st.push(0);
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st + "\n");
		
		System.out.println("POP: " + st.pop());
		System.out.println(st + "\n");
		
		System.out.println("PEEK: " + st.peek());
		System.out.println(st + "\n");
		
		System.out.println(st.isEmpty() + "\n");
		
		//QUEUE
		System.out.println("QUEUE");
		Queue<Integer> qu = new LinkedList<Integer>();
		
		qu.offer(0);
		qu.offer(1);
		qu.offer(2);
		qu.offer(3);
		System.out.println(qu + "\n");
		
		System.out.println("POLL: " + qu.poll()); // should remove + return head
		System.out.println(qu + "\n");
		
		System.out.println("PEEK: " + qu.peek()); // should return head
		System.out.println(qu + "\n");
		
		
	}

}
