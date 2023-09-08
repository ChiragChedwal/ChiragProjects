package Constructor;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<String>();
		a.add("Java");
		a.add("Learning");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("Learning"));
		System.out.println(a.isEmpty());
		System.out.println(a.get(2));
		System.out.println(a.size());
		

	}

}
