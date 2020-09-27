package sda;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonAssertTest {

    @Test
    void personTest() {
        //arrange
        final var jan = new PersonTest.Person("Jan", "Kowalski");
        //act
        final var fullName = jan.getFullName();
        Assertions.assertThat(fullName)
                .as("Full name should ne name + space + last name" )
                .startsWith("Jan")
                .contains(" ")
                .endsWith("Kowalski");
    }
}
