package com.example.batchprocessing;

import com.example.dto.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by Administrator on 2017/6/17 0017.
 */
public class PersonItemProcessor implements ItemProcessor<Person,Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    //A common paradigm in batch processing is to ingest data, transform it, and then
    // pipe it out somewhere else. Here you write a simple transformer that converts the names to uppercase.
    @Override
    public Person process(final Person person) throws Exception {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }
}
