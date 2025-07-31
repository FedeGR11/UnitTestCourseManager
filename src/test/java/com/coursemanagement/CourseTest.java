package com.coursemanagement;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

public class CourseTest {

    private Course course;

    @BeforeAll
    static void  setUp() {
        System.out.println("Inicializando test");
    }

    @Tag("regression") 
    @ParameterizedTest
    @MethodSource("providedData")
    @DisplayName("Test de professor nulos o vacios pasen como unnasigned")
    void testProfessorNullAndEmpty(String title, int duration, String professor) {
        course = new Course(title, duration, professor);
        Assertions.assertEquals("Unnasigned", course.getProfessor());
    }

    static Stream<Arguments> providedData() {
        return Stream.of(
            Arguments.of("Java", 25, null),
            Arguments.of("Tester", 20, " "),
            Arguments.of("C#", 30, " ")
        );
    }
    
    @Tag("smoke")
    @DisplayName("Mostrando resultados showInfomation() con profesor asignado")
    @ParameterizedTest
    @CsvFileSource(resources = "/courses.csv", numLinesToSkip = 2)
    void testShowInformation(String title, int duration, String professor) {
        course = new Course(title, duration, professor);     
        String expected = (title + " (" + duration + "hs) - Professor: " + professor);
        assertEquals(expected, course.showInformation());
    }
}

