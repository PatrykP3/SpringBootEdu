package org.nowpat.springbootedu.processor;

import java.util.List;
import lombok.AllArgsConstructor;
import org.nowpat.springbootedu.printer.Printer;
import org.nowpat.springbootedu.provider.PrinterProvider;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

@Component
@AllArgsConstructor
public class Processor {

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
