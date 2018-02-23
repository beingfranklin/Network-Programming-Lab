import java.util.*;

class Fact{

public static void main(String args []){
Scanner scan = new Scanner (System.in);
System.out.println("Input the Number:");
int n = scan.nextInt();
int fact= 1;
 if ( n== 0)
{
System.out.println("Factorial is 1");
}
else
{
while (n>0)
{
fact=fact*n;
n--; 
}
System.out.println("Factorial is "+ fact);
}
}

}