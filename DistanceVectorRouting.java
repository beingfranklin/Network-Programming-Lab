import java.io.*;
import java.util.Scanner;
public class DistanceVectorRouting
{
 static int graph[][];
 static int via[][];
 static int rt[][];
 static int v;
 static int e;

 public static void main(String args[]) throws IOException
 {
  Scanner scan =new Scanner(System.in);
  
  System.out.println("Please enter the number of Vertices: ");
  v = scan.nextInt();
  
  System.out.println("Please enter the number of Edges: ");
  e =scan.nextInt();
  
  graph = new int[v][v];
  via = new int[v][v];
  rt = new int[v][v];
  for(int i = 0; i < v; i++)
   for(int j = 0; j < v; j++)
   {
    if(i == j)
     graph[i][j] = 0;
    else
     graph[i][j] = 99;
   }
  
  for(int i = 0; i < e; i++)
  {
   System.out.println("Please enter data for Edge " + (i + 1) + ":");
   System.out.print("Source: ");
   int s = scan.nextInt();
   s--;
   System.out.print("Destination: ");
   int d =scan.nextInt();
   d--;
   System.out.print("Cost: ");
   int c = scan.nextInt();
   graph[s][d] = c;
   graph[d][s] = c;
  }
  
  dvr_calc_disp("The initial Routing Tables are: ");
 
  
 }
 
 static void dvr_calc_disp(String message)
 {
  System.out.println();
  init_tables();
System.out.println(message);
print_tables();
 update_tables();
  System.out.println("Final Routing Table ");
  print_tables();
  System.out.println();
 }
 
 static void update_table(int source)
 {
  for(int i = 0; i < v; i++)
  {
   if(graph[source][i] != 9999)
   {
    int dist = graph[source][i];
    for(int j = 0; j < v; j++)
    {
     int inter_dist = rt[i][j];
     if(via[i][j] == source)
      inter_dist = 9999;
     if(dist + inter_dist < rt[source][j])
     {
      rt[source][j] = dist + inter_dist;
      via[source][j] = i;
     }
    }
   }
  }
 }
 
 static void update_tables()
 {
  int k = 0;
  for(int i = 0; i < 4*v; i++)
  {
   update_table(k);
   k++;
   if(k == v)
    k = 0;
  }
 }
 
 static void init_tables()
 {
  for(int i = 0; i < v; i++)
  {
   for(int j = 0; j < v; j++)
   {
    if(i == j)
    {
     rt[i][j] = 0;
     via[i][j] = i;
    }
    else if (graph[i][j]!=99)
{
	rt[i][j]=graph[i][j];
	via[i][j]=i;
}

    else
    {
     rt[i][j] = 99;
     via[i][j] = 99;
    }
   }
  }
 }
 
 static void print_tables()
 {
int k=0;

while (k<v)
{
System.out.println("Routing Table For "+(k+1)+"\n"+"Node"+"  Dist"+"  "+"Via");
  for(int i = 0; i < v; i++)
  {
System.out.print((i+1)+"      ");
    System.out.print(rt[i][k] + "   "+  (via[i][k]+1));
System.out.println("\n");
  }
k++;
System.out.println("\n");
 }
 }
}

