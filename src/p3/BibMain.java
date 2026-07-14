package p3;

import java.util.*;

public class BibMain {
    static Library<Book> books = new Library<>();

    public static void main(String[] args) {
        fillLibrary(books, "Java", "Python", "Clean Code", "DatenStrukturen", "Java");
        books.showLibrary();
        Scanner sc = new Scanner(System.in);
        putBookIntoLib(sc, books);
        getOnWaitingList(sc,books);
        removeBookFromLib(sc, books);




        sc.close();
    }
    public static void getOnWaitingList(Scanner sc, Library<Book> bib){ //Alles untested btw :) (Wird zu 90% einen Fehler beinhalten)
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
                List<Book> l = new ArrayList<>();
                for (Book b : books.getBib()){
                    if (b.equals(temp)){
                        if (b.getWaitingList().getSize() == 0){
                            System.out.println("Das Buch wurde für sechs Tage reserviert.");
                            temp = b;
                            break;
                        }else{
                            l.add(b);
                        }
                    }
                }
                Book min = new Book("");
                if (!l.isEmpty()){
                    min = l.get(0);
                } else{
                    //System.out.println("Dieser Fall dürfte nicht eintreten :)");
                    //System.out.println("Du bist erster auf der Warteliste"); //Auch hier möglich, dann in dem Fall Positionsbestimmung unnötig.
                }
                for(Book b : l){
                    if (b.getWaitingList().getSize() < min.getWaitingList().getSize()){
                        min = b;
                    }
                }
                System.out.println("Es stehen noch " + min.getWaitingList().getSize() + " Leute vorher auf der Warteliste.");

                System.out.println("Wie lautet Ihr Name?");
                s = sc.nextLine();
                if (min.getWaitingList().isEmpty()){
                    System.out.println("Buch ausgehändigt an: ");
                    min.getWaitingList().addToWaitingList(s);
                    min.getWaitingList().giveBookToNextPerson();
                    return; //optional
                }
                if (min.getWaitingList().contains(s)){
                    if(false){}
                    else{
                        List<String> a = new ArrayList<>();
                        //Breaking the waitingList :D
                        while(!min.getWaitingList().isEmpty()){
                            a.addFirst(min.getWaitingList().poll());
                        }
                        for (int i = 0; i < a.size(); i++) {
                            if (s.equalsIgnoreCase(a.get(i))){
                                System.out.println("Aktuelle Position auf der Warteliste: " + (i+1));
                                break;
                            }
                        }
                        //Repair waitingList :(
                        for (int i = 0; i < a.size(); i++) {
                            min.getWaitingList().addToWaitingList(a.get(i));
                        }
                    }
                }
                else{
                    min.getWaitingList().addToWaitingList(s);
                    System.out.println("Sie sind Platz " + min.getWaitingList().getSize() + " auf der Warteliste.");
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
            return;
        }
        System.out.println("Buch nicht gefunden.");
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
