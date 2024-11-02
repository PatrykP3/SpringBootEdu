package org.nowpat.springbootedu.provider;

import java.util.ArrayList;
import java.util.List;
import org.nowpat.springbootedu.printer.Printer;
import org.nowpat.springbootedu.printer.PrinterLong;
import org.nowpat.springbootedu.printer.PrinterShort;

public class PrinterProvider {

    private List<Printer> printers = new ArrayList<>();

    public PrinterProvider() {
        printers.add(new PrinterLong());
        printers.add(new PrinterShort());
    }

    public Printer getPrinter(int length) {
        return printers.stream().filter(printer -> printer.canPrint(length)).findFirst().orElse(null);
    }
}
