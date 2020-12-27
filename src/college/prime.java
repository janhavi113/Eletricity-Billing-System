
import java.util.Scanner;


public class prime {
      public static int sum=0;
    
    
    public static int prime_no()
    {
     		int n,status=1,num=3;
		n=50;
                //sum=2;		
                int i=0;		
                while(num!=50)
		{
			for(int j=2;j<=Math.sqrt(num);j++)
			{
				if(num%j==0)
				{ 
					status=0;
					break;
					
				}
			}
			if(status!=0)
			{
				sum=sum+num;
				System.out.println(num);
				i++;
			}
			status=1;
			num++;
		}
		System.out.println("Sum of prime number: "+sum);
                return sum;
                
    }

     
   /* public static void main(String args[])
    {
        prime p=new prime();
        p.prime_no();
    }
*/
 
 
}
