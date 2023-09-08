package Constructor;

public class construtorDemo {
	
	//Default Constructor
	public construtorDemo()
	{
		System.out.println("I am the constructor");
	}

	//Parameterized Constructor
	public construtorDemo(int a, int b)
	{
		System.out.println("I am the Paramerized constructor");
	}
	
	public void getData()
	{
		System.out.println("I am the Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//compile will call constructor default while you will not defined the constructor
		construtorDemo cd = new construtorDemo();
		
		
		

	}

}
