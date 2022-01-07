import java.util.Random;

public class password_generator {

    public static int generateRandom(){
        Random rn = new Random();
        int random_num = rn.nextInt(0, 26);
        return random_num;
    }
    public static void main(String[] args) {
        String letters[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String password = "";
        int length = 8;
        while (length > 0) {
            int num = generateRandom();
            if(password.indexOf(letters[num]) == -1){
                password = password + letters[num];
            }
            else {
                password = password + letters[generateRandom()];
            }
            length--;
        }

        System.out.println(password);
    }
}