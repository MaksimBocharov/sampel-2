package Lesson7;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestBook {
    @Test
    public void firstTest() {

        Book book = new Book();
        book.setAuthor("Jack London");
        book.setName("White Fang");
        book.setGenre("Adventure");
        book.setYear(1906);
        book.setISBN("Eng-Something - 1234567890");
        assertThat(book.getName()).isEqualTo("White Fang");

    }
}
