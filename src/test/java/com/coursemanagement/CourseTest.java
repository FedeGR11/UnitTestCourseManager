package com.coursemanagement;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CourseTest {

    private Course course;

    @BeforeAll
    static void  setUp() {
        System.out.println("Inicializando test");
    }

    @DisplayName("Probando GetProffesor() sin valor")
    @Test
    void testGetProfessor() {
        course = new Course("java", 20, "");
        String expected = "Unnasigned";
        assertEquals(expected, course.getProfessor());
    }
    
    @DisplayName("Mostrando resultados showInfomation() con profesor asignado")
    @ParameterizedTest
    @CsvFileSource(resources = "/courses.csv", numLinesToSkip = 2)
    void testShowInformation(String title, int duration, String professor) {
        course = new Course(title, duration, professor);     
        String expected = (title + " (" + duration + "hs) - Professor: " + professor);
        assertEquals(expected, course.showInformation());
    }
}

