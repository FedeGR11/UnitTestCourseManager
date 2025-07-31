package com.coursemanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.api.BeforeEach;


public class OnlineCourseTest {

    @BeforeEach
    void setUp() {
        System.out.println("Inicializando antes de un test");
    }

    @Tag("regression")
    @DisplayName("Probando setPlataform()")
    @ParameterizedTest
    @CsvFileSource(resources = "/onlinecourses.csv", numLinesToSkip = 1)
    void testSetPlataform(String title, int duration, String professor, String plataform) {
        OnlineCourse onlineCourse = new OnlineCourse(title, duration, professor, plataform);
        onlineCourse.setPlataform("Campus Bios");
        assertEquals("Campus Bios", onlineCourse.getPlataform());
    }

    @Tag("regression")
    @ParameterizedTest
    @NullSource
    @DisplayName("Test con plataforma nula o vacía")
    void testPlataformNull(String plataform) {
        OnlineCourse onlineCourse = new OnlineCourse("Java", 20, "Fede", "a");
        onlineCourse.setPlataform(plataform);
        Assertions.assertNull(onlineCourse.getPlataform());

    }

    @Tag("smoke")
    @DisplayName("Muestra informacion del curso")
    @Test
    void testShowInformation() {
        OnlineCourse onlineCourse = new OnlineCourse("Java", 20, "fede", "Campus Bios");
        String expected = ("[Online] Java (20hs) - Professor: fede - Plataform: Campus Bios");
        assertEquals(expected, onlineCourse.showInformation());
    }
}
