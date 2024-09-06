import java.util.ArrayList;
import java.util.Arrays;

public class BookShelf {
    public String name;
    public ArrayList<String> books = new ArrayList<>();
    public ArrayList<String> readingList = new ArrayList<>();

    public BookShelf(){
        this.name = "defaultShelf";
        books.add("The Catcher in the Rye");
        books.add("To Kill a Mockingbird");
        books.add("1984");
        books.add("Pride and Prejudice");
        books.add("The Great Gatsby");
    }

    // ---------------------Methods for class Bookshelf---------------------

    // ---------------------getters---------------------


    public int getCount(){
        return books.size();
    }

    public String getBook(int index){
        return books.get(index);
    }

    public ArrayList<String> getShelf(){
        return books;
    }
    // ---------------------setters---------------------

    public void setShelfName(String name){
        this.name = name;
    }



    // ---------------------adding books---------------------
    public void addBooks(String book_name){
        books.add(book_name);

    }

    public void addBooks(String[] book_names){
        books.addAll(Arrays.asList(book_names));
    }

    // ---------------------Deleting books---------------------

    public void removeBook(int index){
        books.remove(index);

    }

    public void ClearShelf(){
        books.clear();
    }


    public ArrayList<String> getReadingList() {
        return readingList;
    }
    public void removeReading(int index){
        readingList.remove(index);
    }
}
