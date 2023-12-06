import java.util.Scanner;  
public class Largest 
{  
public static void main(String[] args)   
{  
int x, y, z, larg, temp;  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the first number:");  
x = sc.nextInt();  
System.out.println("Enter the second number:");  
y = sc.nextInt();  
System.out.println("Enter the third number:");  
z = sc.nextInt();  
temp=x>y?x:y;  
largest=z>temp?z:temp;  
System.out.println("The largest number is: "+largest);  
}  
} 