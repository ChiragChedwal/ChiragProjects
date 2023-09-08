package Constructor;

import java.util.Scanner;

public class PallindromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;
		int n;
		
		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(n>0) 
		{
		r = n%10;
		sum = (sum*10) + r;
		n=n/10;
		}
if(temp==sum)
{
	System.out.println("Palindrom number");
}
else
{
	System.out.println("Not a pallindrom number");
}
	}

}
