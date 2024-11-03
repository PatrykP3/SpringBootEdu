package org.nowpat.springbootedu;

import java.util.Arrays;
import org.nowpat.springbootedu.processor.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private Processor processor;

    @Override
    public void run(String... args) {
        processor.process(Arrays.asList(args));
    }
}
