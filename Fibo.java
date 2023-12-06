class 1Fibo{
public static void main(String args[])
{
int s1=0,s2=1,s3,i,n=10;
System.out.print(s1+" "+s2);
for(i=0;i<n;++i)
{
s3=s1+s2;
System.out.print(""+s3);
s1=s2;
s2=s3;
}
}
}
