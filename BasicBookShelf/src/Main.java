//import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Please let me know your name!!!");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello! " + name + "\n\nWelcome to My Book Shelf, Let me know how i can be of help");

        OptionHandler handler = new OptionHandler();
        do{
            int choice = OptionGetter.choiceGetter(sc);
            handler.optionWorker(choice,sc);
            System.out.println("""
                    
                     Do you wish to continue with the BookShelf
                     Press "No" to exit.
                    """);
        }while(!sc.next().trim().equalsIgnoreCase("no"));

        sc.close();
    }
}