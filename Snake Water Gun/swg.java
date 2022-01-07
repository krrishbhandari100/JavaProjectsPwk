import java.util.Random;
import java.util.Scanner;

public class swg {

    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner name_sc = new Scanner(System.in);
        String name = name_sc.next();

        char[] outcomes = {'S', 'W', 'G'};
        Random rn = new Random();
        int chances = 8;
        int comp_score = 0;
        int user_score = 0;
        
        while (chances > 0) {
            int num = rn.nextInt(0,3);
            System.out.println("Press 0 for Snake, 1 for Water and 2 for Gun");
            Scanner user_inp_sc = new Scanner(System.in);
            int user_inp = user_inp_sc.nextInt();
            
            if(user_inp == num){
                System.out.println("Draw");
                System.out.println(name + " Choosed: " + outcomes[user_inp]);
                System.out.println("Computer Choosed: " + outcomes[num]);
            }

            else if((user_inp == 0 && num == 1) || (user_inp == 1 && num == 2) || (user_inp == 2 && num == 0)){
                System.out.println(name + " Won");
                System.out.println(name + " Choosed: " + outcomes[user_inp]);
                System.out.println("Computer Choosed: " + outcomes[num]);
                user_score = user_score + 1;

            }

            else {
                System.out.println("Computer Won");
                System.out.println(name + " Choosed: " + outcomes[user_inp]);
                System.out.println("Computer Choosed: " + outcomes[num]);
                comp_score = comp_score + 1;
            }

            chances--;
        }
        System.out.println("Your Score: " + user_score);
        System.out.println("Computer Score: " + comp_score);
        
        if(user_score == comp_score){
            System.out.println("The Game is Draw");
        }

        else if(user_score > comp_score){
            System.out.println("Congratulations, " + name + " You won");
        }

        else {
            System.out.println("Sorry, " + name + " Computer won, better luck next time");
        }
        
    }
}