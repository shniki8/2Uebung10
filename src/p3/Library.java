package p3;

import java.util.*;

public class Library<T> {
    Collection<T> bib = new LinkedList<>();

    public boolean hasDuplicate01(){
        Queue<T> q = new ArrayDeque<T>();
        boolean b = false;
        outer:
        for (T t : bib){
            if (q.isEmpty()){
                q.offer(t);
                continue;
            }
            else{
                for(T t2 : q){
                    if (t.equals(t2)){
                        b = true;
                        break outer;
                    }
                }
            }
            q.offer(t);
        }
        return b;
    }

    public boolean hasDuplicate02(){
        Set<T> s = new HashSet<>();
        boolean b;
        for (T t : bib){
            b = s.add(t);
            if (b == false){
                return true; //Duplikat gefunden
            }
        }
        return false;
    }

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
