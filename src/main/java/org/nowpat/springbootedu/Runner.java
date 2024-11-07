package org.nowpat.springbootedu;

import java.util.Arrays;
import org.nowpat.springbootedu.processor.Processor;
import org.nowpat.springbootedu.reader.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private Processor processor;

    private Reader reader = new Reader();

    @Override
    public void run(String... args) {

        processor.process(reader.readFile(Arrays.asList(args).get(0)));
    }
}
