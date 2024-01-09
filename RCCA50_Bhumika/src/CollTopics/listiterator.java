package CollTopics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class listiterator {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20.04);
		l.add(false);
		l.add("hellohai");
		ListIterator itr = l.listIterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
		while(itr.hasPrevious())
		{
			Object obj = itr.previous();
			System.out.println(obj);
		}

	}

}
