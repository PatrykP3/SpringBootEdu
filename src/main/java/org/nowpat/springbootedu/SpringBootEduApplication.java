package org.nowpat.springbootedu;

import org.nowpat.springbootedu.processor.Processor;
import org.nowpat.springbootedu.reader.Reader;

public class SpringBootEduApplication {

    public static void main(String[] args) {

        Reader reader = new Reader();
        Processor processor = new Processor();

        processor.process(reader.readFile("test_strings.txt"));
    }
}
