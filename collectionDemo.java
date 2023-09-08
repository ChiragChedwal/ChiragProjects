package Constructor;

import java.util.ArrayList;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,5,5,5,4,6,6,9,4};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int k=0;
		
		for(int i=0; i<a.length;i++)
		{
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				
				for(int j=0; j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
			//	System.out.println(a[i]);
			//	System.out.println(k);
				if(k==1)
				
					System.out.println(a[i]+ "is unique number");
				
			}
			
		}
	
	
	}

}
