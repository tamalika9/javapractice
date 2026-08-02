import java.util.Scanner;
public class PrimeNumber{
 public static void main(String [] args){
    Scanner obj = new Scanner (System.in);
System.out.println("Enter a number: ");
int num = obj.nextInt();
var flag=0;
for(int i=2; i<=num/2; i++){
    if(num%i==0){
        flag=1;
        break;
    }
    else{
        flag=0;
    }
    if (flag==0){
        System.out.println("The number is prime");
    }
    else{
        System.out.println("The number is not prime");
    }
} }   
}