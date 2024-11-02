package org.nowpat.springbootedu.printer;

public interface Printer {

    boolean canPrint(int length);
    void print(String s);
}
