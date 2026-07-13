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




        sc.close();
    }
    public static void getOnWaitingList(Scanner sc, Library<Book> bib){
        System.out.println("Sollen alle Bücher angezeigt werden?");
        String s = sc.nextLine();
        if (s.equalsIgnoreCase("ja")){
            bib.showLibrary();
        }
        System.out.println("Soll ein Buch ausgeliehen werden?");
        s = sc.nextLine();
        if (s.equalsIgnoreCase("ja")){
            System.out.println("Welches Buch soll ausgeliehen werden?");
            s = sc.nextLine();
            if (books.containsItem(new Book(s))){
                System.out.println("Buch gefunden.");
                Book temp = new Book(s);
                for (Book b : books.getBib()){
                    if (b.equals(temp)){
                        if (b.getWaitingList().getSize() == 0){
                            System.out.println("Das Buch wurde für sechs Tage reserviert.");
                        }else{
                            System.out.println("Es stehen noch " + b.getWaitingList().getSize() + " Leute vorher auf der Warteliste.");
                        }
                        System.out.println("Wie lautet Ihr Name?");
                        s = sc.nextLine();
                        b.getWaitingList().addToWaitingList(s);
                        System.out.println("Sie sind Platz " + b.getWaitingList().getSize() + " auf der Warteliste.");
                        break;
                    }

                }
            }else{
                System.out.println("Buch nicht gefunden.");
                return;
            }
        }
        return;
    }
    public static void removeBookFromLib(Scanner sc, Library<Book> b){
        System.out.println("Welches Buch soll entfernt werden?");
        String s = sc.nextLine();
        if (b.containsItem(new Book(s))){
            b.removeItem(new Book(s));
        }
    }
    public static void putBookIntoLib(Scanner sc, Library<Book> books){
        System.out.println("Welches Buch soll hinzugefügt werden?");
         String s = sc.nextLine();
         books.addItem(new Book(s));
    }
    public static void fillLibrary(Library<Book> bib, String... titles){
        for (String s : titles){
            books.addItem(new Book(s));
        }
    }

}
