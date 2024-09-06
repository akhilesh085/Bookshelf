import java.util.Scanner;

public class OptionHandler extends BookShelf {

    BookShelf shelf = new BookShelf();

    public void optionWorker(int option, Scanner sc){
        if (option == 1){
            System.out.println("\n Please provide the name for the bookshelf\n");

            String shelf_name = sc.nextLine();
            shelf.setShelfName(shelf_name);

            System.out.println("\n  bookshelf is now named " +shelf_name+ "\n");
        }
        else if (option == 2) {
            System.out.println("Please let me know to add one book or more");

            System.out.println("""
                    \n Type 'more' to add more than one book to shelf or 'just one' to add one""");
            String command = sc.nextLine().trim();

            if(command.equals("just one")){
                System.out.println("Provide the name");
                String book = sc.nextLine().trim();

                shelf.addBooks(book);
                System.out.println("Book has been added");
            }
            else if(command.equals("more")){
                System.out.println("Ok so please provide total number of books you wish to add to shelf");
                int total = sc.nextInt();
                sc.nextLine();
                String[] newBooks = new String[total];
                for(int i=0; i<total;i++){
                    newBooks[i] = sc.next();
                }

                shelf.addBooks(newBooks);
                System.out.println("\n the books have been added.");
            }

        }
        else if (option == 3) {
            System.out.println("Please let me know to remove a book or if to clear shelf");

            System.out.println("\n Type 'all' to clear shelf or 'not all' to continue");
            String command = sc.nextLine().trim();

            if(command.equals("all") || command.equals("All")){
                shelf.ClearShelf();
                System.out.println("No Books left on the shelf");
            }
            else if(command.equals("not all")){
                System.out.println("Ok so please choose the index of the book you wish to remove");
                System.out.println("The available books are\n"+ shelf.getShelf());
                int removingIndex = sc.nextInt();
                sc.nextLine();
                shelf.removeBook(removingIndex);
                System.out.println("\n the book is removed.");
            }



        }
        else if (option == 4){
            int count = shelf.getCount();
            System.out.println("Total count of books is "+ count);
            System.out.println("The available books are\n"+ shelf.getShelf());

        }
        else if (option == 5){
            System.out.println("The available books are\n"+ shelf.getShelf());
            System.out.println("Please provide the book index number that you wish to use\n");

            int book_index = sc.nextInt();
            shelf.readingList.add(shelf.getBook(book_index));
            System.out.println("Enjoy Reading"+shelf.getBook(book_index)+"\n");
            shelf.removeBook(book_index);

        }
        else if (option == 6){
            System.out.println("""
                                 Please provide the index for the book
                                 that you wish to return""");
            System.out.println(shelf.getReadingList());

            int borrowed_index = sc.nextInt();
            shelf.removeReading(borrowed_index);

            System.out.println("Thanks for returning the book, Happy Reading");

        }
        else{System.out.println("Working on it");}

    }

}
