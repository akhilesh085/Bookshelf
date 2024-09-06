import java.util.Scanner;

public class OptionGetter {
    public static int choiceGetter(Scanner sc) {
        int option = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println("""
                        Choose between options 1 to 6!
                        1.) Create the bookshelf
                        2.) Add books to the bookshelf
                        3.) Remove books from the shelf
                        4.) Check total number of books in the bookshelf
                        5.) Take a new book for reading
                        6.) Return a book after reading""");

                option = sc.nextInt();
                sc.nextLine();
                if (option <= 6 && option >= 1) {
                    System.out.println("The option you have selected is " + option
                            + ", which is valid. Wait as we execute your request.");
                    valid = true;  // Option is valid, break out of the loop
                } else {
                    throw new InvalidOptionException("The option you have selected is invalid.");
                }
            } catch (InvalidOptionException ex) {
                System.out.println(ex.wrongOptionMessage());
            }
        }

        return option;
    }
}
