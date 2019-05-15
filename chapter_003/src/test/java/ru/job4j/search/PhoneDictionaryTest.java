package ru.job4j.search;


import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Sherlock", "Holmes", "8342543", "221B Baker Street")
        );
        List<Person> person = phones.find("Sherlock");
        assertThat(person.iterator().next().getSurname(), is("Holmes"));
    }
}
