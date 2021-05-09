package str;
import java.util.*;
public class e2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    String str1=sc.nextLine();
	    String str2=sc.nextLine();

	if( str1.substring( str1.length()-1).equalsIgnoreCase( str2.substring(0,1)) )
	                    System.out.println(  str1.concat( str2.substring(1, str2.length())).toLowerCase() );
	                else
	                    System.out.println(  str1.concat( str2) );
}
}
