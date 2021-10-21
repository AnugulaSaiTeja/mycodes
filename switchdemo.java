import java.util.*;
public class switchdemo
{
	public static void main(String args[])
	{
		int n1,n2,sum;
		System.out.println("Enter the numbers");
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		sum=n1+n2;
		char ch,yrn;
		System.out.println("Enter your option");
		System.out.println(" 1 for Addition \n 2 for Average \n 3 for even/odd \n 4 for positive or negative \n 5 for prime or not \n " );
		ch=sc.nextChar();
		while(1)
		{
			switch(ch)
			{
				case '1' : System.out.println("Addition Result is " +(n1+n2));
							break;
				case '2' : System.out.println("Average Result is " +(n1+n2)/2);
							break;
				case '3' :  if((n1+n2)/2==0)
							{
								System.out.println("Even Number");
							}
							else
							{
								Systemn.out.println("Odd Number");
							}
							break;
				case '4' : if((n1+n2)>0)
							{
								System.out.println("Positive Number");
							}
							else
							{
								Systemn.out.println("Negative Number");
							}
							break;
				case '5' :  int count;
							for(int i=2;i<(sum-1);i++);
								count++;
							if(count==0)
							{
								System.out.println("Prime Number");
							}
							else
							{
								Systemn.out.println("Not a Prime Number");
							}
							break;
							
				default	:	System.out.println("Invalid Option");
				
			}
			
			System.out.println("Do you want to continue Y/N" );
			yrn=sc.nextChar();
			if(yrn=='y')
				continue;
			else if(yrn=='n')
				exit(0);
			
			
		}
		
		
	}
}