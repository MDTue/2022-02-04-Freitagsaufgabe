package de.neuefische.passwort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswortvalidierungTest {
    @Test
    void shouldBeHaveLengtAcht() {
        // given
        String pw = "agsbdtre";
        // when
        boolean laengeIsValid = Passwortvalidierung.passwortLen(pw);
        // then
        assertTrue(laengeIsValid);
    }

    @Test
    void shouldContainNumber() {
        // given
        String pw = "ags1dtre";
        // when
        boolean containsNumber = Passwortvalidierung.pwMitZahlen(pw);
        // then
        Assertions.assertTrue(containsNumber);
    }

    @Test
    void shouldContainUpper() {
        // given
        String pw = "ajdhAwer";
        // when
        boolean containsUpper = Passwortvalidierung.pwMitUpperLetter(pw);

        // then
        Assertions.assertTrue(containsUpper);
    }

    @Test
    void shouldContainLower() {
        // given
        String pw = "AJH§!Da";
        // when
        boolean containsLower = Passwortvalidierung.pwMitLowerLetter(pw);
        // then
        Assertions.assertTrue(containsLower);




    }
}



