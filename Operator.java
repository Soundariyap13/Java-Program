import java.util.Scanner;
class Operator
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(a&b);
System.out.println(a|b);
System.out.println(a^2);
System.out.println(a>>2);
System.out.println(a<<b);
System.out.println(~a);
System.out.println(a<=b);
System.out.println(a>=b);
System.out.println(a>b);
System.out.println(a!=b);
}
}