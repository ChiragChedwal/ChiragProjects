package Constructor;

public class ExceptionDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =7;
		int b =0;
		
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
