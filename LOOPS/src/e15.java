import java.util.Scanner;
public class e15
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	    	if(num==1 || num==0 ||num==10)
		      {
		    	  System.out.println(num + "neither prime nor composite");
		      }
	      if (num % i == 0) {
	        flag = true;
	        break;
	        
	      }
	    }
	   

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}
