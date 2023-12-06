public class 2Prime{
public static void main(Strings args[]){
int i,n=0,flag=0;
int m=3;
n=m/2;
if(m==0||m==1){
 System.out.println("The value is not prime"+m);
}
else{
  for(i=2;i<=n;i++){
   if(m%i==0){
    System.out.println("The value is not prime number"+m);
    flag=1;
    break;
    }
  }
  if(flag==0)
   {
     System.out.println("The value is prime number"+m);
   }
   }
}
}
