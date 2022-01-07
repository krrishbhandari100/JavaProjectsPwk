import java.util.Scanner;

public class a {
    public static int fibonacci(int n) {
        if(n == 1){
            return 0;
        }
        else if(n == 2 || n == 3){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int term = sc.nextInt();
            int thterm = fibonacci(term);
            System.out.println(thterm);
        }
        catch (Exception e) {
            System.out.println("Some Error:");
        }

    }

    
}