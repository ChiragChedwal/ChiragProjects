package Constructor;

import java.util.HashSet;
import java.util.Iterator;

public class hasSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("US");
		hs.add("UK");
		hs.add("Europe");
		System.out.println(hs);
		hs.add("Europe");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		
		//Iterator
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
