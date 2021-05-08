import java.util.Scanner;
public class eight {
	public static void main(String[] input)
    {
		Scanner sc=new Scanner(System.in);
	    char c=sc.next().charAt(0);
	    if(c=='R')
	    {
	    	System.out.println("RED");
	    }
	    else if(c=='B')
	    {
	    	System.out.println("BLUE");
	    }
	    else if(c=='G')
	    {
	    	System.out.println("GREEN");
	    }
	    else if(c=='Y')
	    {
	    	System.out.println("YELLOW");
	    }
	    else if(c=='W')
	    {
	    	System.out.println("WHITE");
	    }
	    else if(c=='O')
	    {
	    	System.out.println("ORANGE");
	    }
	    else
	    {
	    	System.out.println("not valid");
	    }
    }

}
