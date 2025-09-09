package src;

public class PrinterAdapter implements Printer {
    private OldPrinter oldPrinter;

    PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String text) {
        oldPrinter.drukujTekst(text);
    }
}
