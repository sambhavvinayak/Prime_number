import java.util.Scanner;

/*
 * find the whether the number is prime or not 
 */
/**
 * project1
 */
public class project1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // input a number to find whether it is prime number is or not
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int count = 0;
        // loop 
        for (int i = 1; i <= n; i++) {
            if ((n%i)==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("it is prime number ");
        }
        else{
            System.out.println("it not a prime number ");
        }
       
}
