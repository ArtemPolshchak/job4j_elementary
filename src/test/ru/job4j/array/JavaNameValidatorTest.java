package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static ru.job4j.array.JavaNameValidator.*;

/**
 * @author artem.polschak@gmail.com on 18.12.2022.
 * @project job4j_elementary
 * Test class checks the validity of names
 */
class JavaNameValidatorTest {
    @Test
    void whenEmptyNameInvalid() {
        assertThat(isNameValid("")).isFalse();
    }

    @Test
    void whenEmptySpaceNameInvalid() {
        assertThat(isNameValid(" ")).isFalse();
    }

    @Test
    void whenFullLatValid() {
        assertThat(isNameValid("first")).isTrue();
    }

    @Test
    void whenFullLatAndSomeUpperCaseLettersValid() {
        assertThat(isNameValid("fIRST")).isTrue();
    }

    @Test
    void whenLatNumberValid() {
        assertThat(isNameValid("first1")).isTrue();
    }

    @Test
    void whenLatWithSpecialSymbolUnderValid() {
        assertThat(isNameValid("first_user")).isTrue();
    }

    @Test
    void whenNumberInValid() {
        assertThat(isNameValid("123")).isFalse();
    }

    @Test
    void whenNumberValid() {
        assertThat(isNameValid("a_123B")).isTrue();
    }

    @Test
    void whenFirstLatinUpperCaseIsInvalid() {
        assertThat(isNameValid("First")).isFalse();
    }

    @Test
    void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        assertThat(isNameValid("fir$t_u$er_1")).isTrue();
    }
}