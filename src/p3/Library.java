package p3;

import java.util.Collection;
import java.util.LinkedList;

public class Library<T> {
    Collection<T> bib = new LinkedList<>();
    //TODO: h) und weiter!

    public void showLibrary(){
        for(T t : bib){
            System.out.println(t.toString());
        }
    }
    public void addItem(T item){
        if (item != null){
            bib.add(item);
        }
    }
    public void removeItem(T item){
        if (containsItem(item)){
            bib.remove(item);
        }
    }
    public boolean containsItem(T item){
        boolean b = false;
        for (T t : bib){
            if (item.equals(t)){
                b = true;
                break;
            }
        }
        return b;
    }

    public Collection<T> getBib() {
        return bib;
    }

    public void setBib(Collection<T> bib) {
        this.bib = bib;
    }
}
