import java.util.Scanner;
public class evenorodd{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
if(n<0){
System.out.println("Negative number");
}
if(n%2==0){
System.out.println("Even number");
}
else
System.out.println("odd number");


}
}

