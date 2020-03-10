package Lesson7;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class TestBookLombok {
    @Test
    public void newTest() {

        BookLombok newBook = new BookLombok();
        newBook.setAuthor("Jack London");
        newBook.setName("White Fang");
        newBook.setGenre("Adventure");
        newBook.setYear(1906);
        newBook.setISBN("Eng-Something - 1234567890");
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(newBook.getAuthor()).isEqualTo("Jack London");
        softly.assertThat(newBook.getName()).isEqualTo("White Fang");
        softly.assertThat(newBook.getGenre()).isEqualTo("Adventure");
        softly.assertThat(newBook.getYear()).isEqualTo(1906);
        softly.assertThat(newBook.getISBN()).isEqualTo("Eng-Something - 1234567890");
        softly.assertAll();

    }
}

