package org.nowpat.springbootedu.printer;

import lombok.AllArgsConstructor;
import org.nowpat.springbootedu.configuration.PrintersConfiguration;

@AllArgsConstructor
public class PrinterLong implements Printer {

    PrintersConfiguration printersConfiguration;

    @Override
    public boolean canPrint(int length) {
        return length > printersConfiguration.getPrinterLong().getLength();
    }

    @Override
    public void print(String s) {
        System.out.println("L: %s".formatted(s));
    }
}
