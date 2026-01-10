import java.util.Scanner;
public class swapwithouttemp{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int m=in.nextInt();

n=n+m;
m=n-m;
n=n-m;
System.out.println("swapping "  +n+","+m);
}
}


