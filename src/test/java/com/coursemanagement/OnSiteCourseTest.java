package com.coursemanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class OnSiteCourseTest {

    @BeforeAll
    static void  setUp() {
        System.out.println("Inicializando test");
    }

    @AfterAll
    static void cleanUp(){
        System.out.println("Finalizando test");
    }

    @DisplayName("Probando setMaxQuota()")
    @ParameterizedTest
    @CsvFileSource(resources = "/onsitecourses.csv", numLinesToSkip = 1)
    void testSetMaxQuota(String title, int duration, String professor, int room, int maxQuota) {
        OnSiteCourse onSiteCourse = new OnSiteCourse(title, duration, professor, room, maxQuota);
        onSiteCourse.setMaxQuota(25);
        assertEquals(25, onSiteCourse.getMaxQuota());
    }
    
    @DisplayName("Probando setRoom() para todos los cursos")
    @ParameterizedTest
    @CsvSource ({
        "Java, 20, vale, 10, 25",
        "Tester, 40, Roque, 12, 25"
    })
    void testSetRoom(String title, int duration, String professor, int room, int maxQuota) {
        OnSiteCourse onSiteCourse = new OnSiteCourse(title, duration, professor, room, maxQuota);
        onSiteCourse.setRoom(8);
        assertEquals(8, onSiteCourse.getRoom());
    }
    
    @DisplayName("Muestra informacion del curso")
    @Test
    void testShowInformation() {
       OnSiteCourse onSiteCourse = new OnSiteCourse("Java", 20, "Vale", 10, 30);
       String expected = ("[On Site] Java (20hs) - Professor: Vale - Room: 10, Quota: 30");
       assertEquals(expected, onSiteCourse.showInformation());

    }
}
