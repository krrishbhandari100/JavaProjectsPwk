import java.util.Scanner;

/**
 * armstrong
 */
public class armstrong {

    public static void main(String[] args) {
        System.out.println("Checking for armstrong");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String n = Integer.toString(num);
        int ndigits = n.length();

        int copy_num = num;
        double sum = 0d;

        while (copy_num > 0) {
            int digit = copy_num % 10;
            sum = sum + Math.pow(digit, ndigits);
            copy_num = copy_num / 10;
        }

        if(num == sum){
            System.out.println("Yes, its an armstrong number");
        }

        else {
            System.out.println("No, its not an armstrong number");
        }
    }
}