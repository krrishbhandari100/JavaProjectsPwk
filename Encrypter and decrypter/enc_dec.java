import java.util.Scanner;

public class enc_dec {

    public static String Encryption(String str) {
        String enc_text = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    enc_text = enc_text + "@";
                    break;

                case 'b':
                    enc_text = enc_text + "!";
                    break;

                case 'c':
                    enc_text = enc_text + "#";
                    break;

                case 'd':
                    enc_text = enc_text + "^";
                    break;

                case 'e':
                    enc_text = enc_text + "&";
                    break;

                default:
                    break;
            }
        }
        return enc_text;
    }

    public static String Decryption(String str) {
        String dec_text = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '@':
                    dec_text = dec_text + "a";
                    break;

                case '!':
                    dec_text = dec_text + "b";
                    break;

                case '#':
                    dec_text = dec_text + "c";
                    break;

                case '^':
                    dec_text = dec_text + "d";
                    break;

                case '&':
                    dec_text = dec_text + "e";
                    break;

                default:
                    break;
            }
        }
        return dec_text;
    }

    public static void main(String[] args) {
        System.out.println("Press 0 for encryption and 1 for decryption");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 0) {
            System.out.println("Enter the text: ");
            Scanner sc1 = new Scanner(System.in);
            String text = sc1.next();
            String output = Encryption(text);
            System.out.println(output);
        }

        else if(input == 1) {
            System.out.println("Enter the text: ");
            Scanner sc1 = new Scanner(System.in);
            String text = sc1.next();
            String output = Decryption(text);
            System.out.println(output);
        }

        else {
            System.out.println("Please give a correct input");
        }
    }
}