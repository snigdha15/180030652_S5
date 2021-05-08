package one;
import java.util.*;
public class e10 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[3][3];
	int i=0,j=0,g=0;
	System.out.println("enter array elements");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("array elments:");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			System.out.println(a[i][j]+"");
		}
		System.out.println("");
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			if(a[i][j]>g)
				g=a[i][j];
		}
}
	System.out.println("gn:"+g);
}
}
