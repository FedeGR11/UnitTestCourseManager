package com.coursemanagement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CourseTest {
    @Test
    void testSetProfessor() {
        Course course = new Course("java", 20, "");
        String expected = "Unnasigned";

        assertEquals(expected, course.getProfessor());
    }

    @Test
    void testShowInformation() {
       Course course = new Course("JAVA", 20, "");
       String expected = ("JAVA (20hs) - Professor: Unnasigned");
       assertEquals(expected, course.showInformation());
    }
}
