import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number:");
int n=sc.nextInt();
int temp=n;
int digit=0;
int rev=0;
while(temp>0){
temp=temp/10;
digit++;
}
for(int i=1;i<=digit;i++){
int digits=n%10;
rev=rev*10+digits;
n=n/10;
}
System.out.print(rev);
}
}