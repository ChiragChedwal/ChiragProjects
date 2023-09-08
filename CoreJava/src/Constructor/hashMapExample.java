package Constructor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Student 1");
		hm.put(1, "Biology");
		hm.put(2, "Physics");
		hm.put(3, "Maths");
		
		Set st = hm.entrySet();
		Iterator it = st.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
		}

	}

}
