import java.util.Scanner;
class EvenOdd{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = ob.nextInt();
        if(a % 2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
}
