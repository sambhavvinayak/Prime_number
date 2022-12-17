import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter a number to check whether it  is prime number or not : ");
        // int num = input.nextInt();

        int num = 0;
    for (int j = 1; j <=999999999; j++) {
            num ++;
            int count = 0;
        for (int i = 1; i <=num; i++) {
            if (num%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println(j+" : it is a prime number\n");
        }else{
            System.out.println(j+" : it is not prime number\n");
        }
    }
        
        
    }
}
