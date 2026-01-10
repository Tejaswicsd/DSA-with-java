import java.util.Scanner;
public class largestoftwo{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int m=in.nextInt();
int max=n;
if(m>max){
System.out.println(m+"is greater number");
}
else
System.out.println(n+"is greater number");
}
}
