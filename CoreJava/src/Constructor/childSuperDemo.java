package Constructor;

public class childSuperDemo extends parentSuperDemo{

	String name ="Child calling";
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
	{
		System.out.println("I am in child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childSuperDemo cd = new childSuperDemo();
		cd.getStringData();
		cd.getData();
		
		

	}

}
