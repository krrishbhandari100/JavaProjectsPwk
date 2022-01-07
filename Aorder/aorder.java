import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * aorder
 */
public class aorder {

    public static void main(String[] args) {
        System.out.println("Enter how much numbers you want to add");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();


        while (n > 0) {
            Scanner sc1 = new Scanner(System.in);
            int number = sc1.nextInt();
            numbers.add(number);
            n--;
        }
        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
    }
}