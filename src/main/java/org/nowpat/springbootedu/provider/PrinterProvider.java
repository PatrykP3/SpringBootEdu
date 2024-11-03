package org.nowpat.springbootedu.provider;

import java.util.List;
import org.nowpat.springbootedu.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrinterProvider {

    @Autowired
    private List<Printer> printers;

    public Printer getPrinter(int length) {
        return printers.stream().filter(printer -> printer.canPrint(length)).findFirst().orElse(null);
    }
}
