package p3;

import java.util.Scanner;

public class BibMain {
    static Library<Book> books = new Library<>();

    public static void main(String[] args) {
        fillLibrary(books, "Java", "Python", "Clean Code", "DatenStrukturen", "Java");
        books.showLibrary();
        Scanner sc = new Scanner(System.in);
        putBookIntoLib(sc, books);
        removeBookFromLib(sc, books);
    }
    public static void removeBookFromLib(Scanner sc, Library<Book> b){
        System.out.println("Welches Buch soll entfernt werden?");
        //sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        if (books.containsItem(new Book(s))){
            books.removeItem(new Book(s));
        }
    }
    public static void putBookIntoLib(Scanner sc, Library<Book> books){
        System.out.println("Welches Buch soll hinzugefügt werden?");
         //sc = new Scanner(System.in);
         String s = sc.nextLine();
         sc.close();
         books.addItem(new Book(s));
    }
    public static void fillLibrary(Library<Book> bib, String... titles){
        for (String s : titles){
            books.addItem(new Book(s));
        }
    }

}
