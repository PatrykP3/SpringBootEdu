package org.nowpat.springbootedu.processor;

import java.util.List;
import org.nowpat.springbootedu.printer.Printer;
import org.nowpat.springbootedu.provider.PrinterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

@Component
public class Processor {

    @Autowired
    private PrinterProvider printerProvider;

    public void process(List<String> lines) {
        for (String line : lines) {
            Printer printer = printerProvider.getPrinter(line.length());
            if(!isNull(printer)) {
                printer.print(line);
            }
        }
    }
}
