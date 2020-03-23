package Lesson7;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestBook2 {
    Book book = new Book();
    @After
    public void tearDown(){
        book = null;
    }
    @Test
    public void newTest() {
        assertThat(book.getName()).isEqualTo("White Fang");
    }

    @Before
    public void setUp() {
        book.setName("White Fang");
    }
}

//