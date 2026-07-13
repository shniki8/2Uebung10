package p2;

public class ColorPrinter extends Printer{
    //@Override //Überschreibt ja eigentlich nichts
    public ColorDocument process(ColorDocument d) {
        System.out.println("Printer.process(Document)");
        return d;
    }
    @Override
    public ColorDocument process(Document d) {
        System.out.println("Printer.process(Document)c");
        return (ColorDocument) d; //spezifischer, also geht.
    }

}
