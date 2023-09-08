package Constructor;

public class Loop2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int k=1;
	/*	for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++) { 
				System.out.print(j);
				System.out.print("\t");
				//k++;
			}
		
		System.out.println("");
		}*/
		
int abc[][]= {{2,4,5},{8,4,9},{1,3,6}};
int min = abc[0][0];
int mincoloumn =0;

for(int i=0;i<3;i++) 
{
	
for(int j=0;j<3;j++)
{
	 
	if(abc[i][j]<min)
	{
		min = abc[i][j];
		mincoloumn =j;
	}
}

}
//System.out.println(min);
int max = abc[0][mincoloumn];
int k=0;
while(k<0)
{
	if(abc[k][mincoloumn]>max)
	{
		max = abc[k][mincoloumn];
	}
}

	
	
	}

}
