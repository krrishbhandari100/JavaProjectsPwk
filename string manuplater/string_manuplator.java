import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class string_manuplator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newString = "";
        int length = 64;
        List<Character> strlist = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            strlist.add(str.charAt(i));
        }

        while (length > 0) {
            newString = "";
            Collections.shuffle(strlist);
            for (Character character : strlist) {
                newString = newString + character;
            }
            
            System.out.println(newString);
            length--;
        }
        
    }
}