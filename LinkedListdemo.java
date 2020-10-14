package Modul3;
import java.util.*;

public class LinkedListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add(new Integer(1));
		l.add(new Integer(2));
		l.add(new Integer(3));
		l.add(new Integer(1));
		System.out.println(l + ", size = "+ l.size());
		l.addFirst(new Integer(0));
		l.addLast(new Integer(4));
		System.out.println(l);
		System.out.println(l.getFirst()+", "+ l.getLast());
		System.out.println(l.get(2) + ", "+ l.get(3));
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		l.remove(new Integer(1));
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		l.set(2, "one");
		System.out.println(l);
		
		
	}
// Proses push

}
