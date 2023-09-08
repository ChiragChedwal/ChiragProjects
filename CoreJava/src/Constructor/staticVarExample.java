package Constructor;

public class staticVarExample {
	String name;
	String address;
	static String city ="Banglore"; //static variable
	static int i=0;
	
	//Constructor created with class name
	staticVarExample(String name, String address)
	{
		this.name = name;
		this .address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVarExample sv = new staticVarExample("Ram", "Mrathuli");
		staticVarExample sv1 = new staticVarExample("Shyam", "Manali");
		sv.getAddress();
		
		

	}

}
