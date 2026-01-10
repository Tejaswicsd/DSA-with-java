import java.util.Scanner;
public class swap{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int m=in.nextInt();

int temp= m;
m=n;
n=temp;
System.out.println("swapping " +n+","+m);
}
}


