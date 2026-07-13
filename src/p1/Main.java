package p1;

public class Main {
    public static void main(String[] args) {
        /*
        Naja, hier sind meine Lösungen, werden eh nicht zu 100% richtig sein.
        Warte mal, wieso zählt "Naja" als falsch? Wieso fragt mich dieses Programm, ob ich die Giftnatter "Naja" meine, das ist zu viel Ragebait, wow ...
        --Aufgabe 1--
        a):
            i):
                Z. 15, Z.1: T extends Comparable<T>, T oder Subtypen von T die Comparable implementieren.
            ii):
                Z.5, this. Die Methode/Das Attribut wird einfach vom aktuellen Objekt aus genommen, also falls ein Attribut
                ein bspw. überdeckt wird durch Übergabeparameter, die gleichnamig sind, wird so das Klassenattribut verwendet.
            iii):
                Bspw. in Z.20f, da wird in den zweiten <> der Typ inferiert.

        b):
            1):
                i): Geht normal, falls es nichtleer ist, gibt entweder Apple oder Subklasse zurück (Die auch ein Objekt vom Typ Apple sind).
                ii): Geht nicht, Typsicherheit ist gefährdet, Liste hat ? extends Fruit drin, könnte sein, dass Apple in Liste mit anderen Früchten eigenfügtwird!
            2):
                i): Geht, da jeder Apple auch ein Objekt jeder Oberklasse von Apple ist.
                ii): Geht nicht, da eine Oberklasse von Apple nicht in einem Objekt vom Typ Apple gespeichert werden könnte.
         c):
            1):
                public class Sorter<? extends Comparable<?>> {
                    public void sort(List<?> list) {  ...  }
                    }
                Fehler bei ? extends Comparable<?>, ? ist kein Typ! Er ist unbekannt, deswegen darf man es so nicht schreiben.
                korrigiert:
                public class Sorter<T extends Comparable<T>> {
                    public void sort(List<?> list) {  ...  }
                    }
            2):
                Box<? extends Apple> box = new Box<Apple>();
                box.put(new Apple("Gala"));
                Es wird wieder in eine Box vom Typ ? ein Apple versucht zu legen, da spielt die Initialisierung mit Laufzeittyp Apple keine Rolle, die Typsicherheit findet es nicht cool.
                Es wäre böse einen Apfel dort einzufügen! >:(
                Korrektur: Je nach dem was man erreichen will einfach die Typschranke rausnehmen.
            3):
                public static void printAll(Box<Fruit> box) {
                    for (int i = 0; i < box.size(); i++) {
                        System.out.println(box.get(i));
                        }
                        }
                    //Aufruf
                    Box<Apple> apples = new Box<>();
                    printAll(apples);
                    Fehler: Type mismatch, erwartet wird eine Fruit Box aber es bekommt eine vom Typ Apple.
                    Lösung: Ändere Box<Fruit> box zu Box<? extends Fruit> box
          d):
                1):
                    true
                2):
                    Box
                3):
                    Ja.
        Irgendwo wird ein Space falsch sein sodass nicht alles zu 100% aligned ist und das würde mich EXTREMST nerven >:(




         */
    }
}
