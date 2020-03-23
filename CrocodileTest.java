package Lesson7;


import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CrocodileTest {
    Crocodile victim = new Crocodile();

    @After
    public void tearDown() {
        victim = null;
    }


    //
    @Test
    public void firstTest() {
        victim.setSize("Big");
        victim.setColor("Green");
        victim.setLength(150);
        victim.setName("Gena");
        victim.setHungry(true);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(victim.getSize()).isEqualTo("Big");
        softly.assertThat(victim.getColor()).isEqualTo("Green");
        softly.assertThat(victim.getLength()).isEqualTo(150);
        softly.assertThat(victim.getName()).isEqualTo("Gena");
        softly.assertThat(victim.isHungry()).isEqualTo(true);
        softly.assertAll();
    }

    @Before
    public void setUp() {
        victim.setSize("Big");
        victim.setColor("Green");
        victim.setLength(150);
        victim.setName("Gena");
        victim.setHungry(true);

    }
}
