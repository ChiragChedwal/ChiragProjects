package Constructor;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=1, a=1;
//LOOP 1
		for(int i=0;i<4;i++)
		{
			
			for(int j=1; j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println(" ");
		}
//LOOP 2
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
				System.out.print("\t");
				a++;
			}
			System.out.println(" ");
		}
//LOOP 3
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
				//a++;
			}
			System.out.println(" ");
		}
	
//LOOP 4
				for(int i=0;i<4;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(j*3);
						System.out.print("\t");
						//a++;
					}
					System.out.println(" ");
				}
		
	}

}
