package org.nowpat.springbootedu.printer;

import org.nowpat.springbootedu.configuration.PrintersConfiguration;
import org.springframework.stereotype.Component;

@Component
public class PrinterMedium implements Printer{

    PrintersConfiguration printersConfiguration;

    @Override
    public boolean canPrint(int length) {
        return length == 3;
    }

    @Override
    public void print(String s) {
        System.out.println("M: %s".formatted(s));
    }
}
