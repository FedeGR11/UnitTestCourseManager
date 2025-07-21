package com.coursemanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OnlineCourseTest {
    @Test
    void testSetPlataform() {
        OnlineCourse onlineCourse = new OnlineCourse("Java", 20, "fede", "Bios");
        onlineCourse.setPlataform("Campus Bios");
        assertEquals("Campus Bios", onlineCourse.getPlataform());
    }

    @Test
    void testShowInformation() {
        OnlineCourse onlineCourse = new OnlineCourse("Java", 20, "fede", "Campus Bios");
        String expected = ("[Online] Java (20hs) - Professor: fede - Plataform: Campus Bios");
        assertEquals(expected, onlineCourse.showInformation());
    }
}
