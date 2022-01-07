import java.util.ArrayList;

class Library {
    String bookName;
    ArrayList<String> bookArr = new ArrayList<String>();

    
    public ArrayList<String> issueBook(String bookName){
        bookArr.add(bookName);
        return bookArr;
    }
    
    public ArrayList<String> returnBook(String bookName){
        for (String string : bookArr) {
            if(string == bookName){
                bookArr.remove(bookName);
            }
        }
        return bookArr;
    }

}

public class libsystem {

    public static void main(String[] args) {
        Library lib = new Library();
        ArrayList<String> Java = lib.issueBook("Java");
        System.out.println(Java);

        ArrayList<String> Python = lib.issueBook("Python");
        System.out.println(Python);
        
        ArrayList<String> rpy = lib.returnBook("C++");
        System.out.println(rpy);
    }
}