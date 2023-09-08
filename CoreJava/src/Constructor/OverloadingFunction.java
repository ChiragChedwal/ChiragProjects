package Constructor;

public class OverloadingFunction {
	
	public void getData(int a)
	{
		System.out.println(a);
	}

	public void getData(String b)
	{
		System.out.println(b);
	}

public static void main (String [] args) {
	OverloadingFunction of = new OverloadingFunction();
	of.getData(5);
	of.getData("Chirag");
}

}
