package Lab1;
import java.util.Scanner;

public class Cube {
	
	
	

	
		public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			int a=sc.nextInt();
			int sum=0,rem;
			while(a>0)
			{
				rem=a%10;
				sum=sum+rem*rem*rem;
				a=a/10;
				
			}
			System.out.println(sum);
					
			
		}

	}



