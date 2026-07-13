package p3;

import java.util.Objects;

public class Book {
    private String title;
    private WaitingList waitingList;
    public Book(String title){
        this.title = title;
    }


    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book) || obj == null){ //Bewusst instanceof für Vergleichbarkeit, falls es Subklassen gibt und die Aufgabe diese ebenso auf Title reduziert.
            return false;
        }
        else {
            Book b = (Book) (obj);
            return this.title.equals(b.getTitle());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public WaitingList getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(WaitingList waitingList) {
        this.waitingList = waitingList;
    }
}
