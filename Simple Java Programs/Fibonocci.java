import java.util.*;

class Fib{
public static void main(String args []){
int n,first=0,second=0,third=1,i;
Scanner scan = new Scanner (System.in);
System.out.println("Input the Number:");
n = scan.nextInt();
for(i=1;i<=n;i++)
{
	first=second;
	second=third;
	third=first+second;
	System.out.print(first+" ");
}
}
}
