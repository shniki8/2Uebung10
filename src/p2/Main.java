package p2;

public class Main {
    public static void main(String[] args) {
        Printer p = new ColorPrinter();
        p.process(new ColorDocument()); //die Methode nicht die mit Eingabeparameter vom Typ ColorDocument, da p vom Typ printer ist und somit die nimmt, die überschreibt.
        //c): Es ist böse, weil in der Liste ja auch schon andere Objekte stehen könnte. Gäbe es bspw. eine weitere Subklasse von Document nennen wir sie jetzt mal HelloWorldDocument, dann würde versucht werden in ein HelloWorldDocument-Liste ein ColorDocument einzufügen, dass würde nicht gehen. Da das extends nach einer Subklasse
        //    (oder der Klasse selbst) fragt, kann man nichtmal die Typsicherheit mit einem Cast sicherstellen, da der Compiler ? als unbekannt erachtet, es könnte also auch von einen Subtyp sein,
        //    dann wäre es selbst mit Cast ein TypeMismatch!
        //    Beim Rückgabetyp (verfeinern) ist es sicherer, da man i.d.R. immer ein Objekt der Oberklasse in eins der Subklasse umwandeln kann oder zumindest damit arbeiten kann. Beim Parameter können komische Sachen passieren ...
        //    Sonst ist es kein überschreiben mehr, Typparameter anders, andere Methode, ganz einfach. Exception, wenn Oberklasse eingesetzt wird.

    }
}
