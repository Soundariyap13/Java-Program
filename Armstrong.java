public class Armstrong{
 public static void main(String args[]){
   int n=371,originalno,rem,res=0;
   originalno=n;
   while(originalno!=0)
   {
      rem = originalno % 10;
      res+=Math.pow(rem,3);
      originalno /=10;
   }
   if(res == n)
     System.out.println("The value is an Armstrong number" +n);
   else
     System.out.println("The value is not an Armstrong number" +n);
 }
}
      
