import java.lang.*;
import java.io.*;
import java.util.*;

public class palin
{
	public static void main( String args[])
	{
		int f=1,i;
		String a="", n;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter String: ");
		n=scan.next();
		int l = n.length();
 	
      		for (i = l- 1; i >= 0; i-- )
        		 a = a + n.charAt(i);
 

		if(n.equals(a))
		{
			System.out.println("\nPalindrome");
		}
		else 
			System.out.println("\nNot Palindrome");
	}
}
