package minggu5;
import java.util.Scanner;

public class Selection101 {
    public static void main(String[] args) {
        Scanner input01 =new Scanner(System.in);

        System.out.print("Input a number = ");
        int number = input01.nextInt();

        if (number%2 == 0) {
            System.out.println(number+" is an even number!");
        }else{
            System.out.println(number+" is an ood number");

            
        }


    }
    
}
