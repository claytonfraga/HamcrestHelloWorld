package com.ufes.hamcrest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

@DisplayName("Writing assertions for lists")
public class AppTest {

    @Nested
    @DisplayName("When we write assertions for elements")
    public class WhenWeWriteAssertionsForElements {

        private Object first;
        private Object second;

        private List<Object> list;

        @BeforeEach
        void createAndInitializeList() {
            first = new Object();
            second = new Object();

            list = Arrays.asList(first, second);
        }

        @Test
        @DisplayName("Should contain a correct element")
        public void shouldContainCorrectElementWithCustomErrorMessage() {
            assertThat(String.format(
                    "The list doesn't contain the expected object: %s",
                    first
            ),
                    list,
                    hasItem(first)
            );
        }
    }
    @Nested
    @DisplayName("When boolean is true")
    class WhenBooleanIsTrue {

        @Test
        @DisplayName("Should be true")
        void shouldBeTrue() {
            assertThat(true, is(true));
        }
    }
}
