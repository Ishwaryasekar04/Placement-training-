import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number");
int n=sc.nextInt();
int temp=n;
int rev=0;
while(temp>0){
int digit=temp%10;

rev=rev*10+digit;

temp=temp/10;
}
if(rev==n){
System.out.print(n+ " is a plaindrome");
}else{
System.out.print(n+ " is not a plaindrome");
}
}
}