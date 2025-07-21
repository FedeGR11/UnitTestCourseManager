package com.coursemanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OnSiteCourseTest {
    @Test
    void testSetMaxQuota() {
        OnSiteCourse onSiteCourse = new OnSiteCourse("Java", 20, "Vale", 10, 30);
        onSiteCourse.setMaxQuota(25);
        assertEquals(25, onSiteCourse.getMaxQuota());
    }

    @Test
    void testSetRoom() {
        OnSiteCourse onSiteCourse = new OnSiteCourse("Java", 20, "Vale", 10, 30);
        onSiteCourse.setRoom(8);
        assertEquals(8, onSiteCourse.getRoom());
    }

    @Test
    void testShowInformation() {
       OnSiteCourse onSiteCourse = new OnSiteCourse("Java", 20, "Vale", 10, 30);
       String expected = ("[On Site] Java (20hs) - Professor: Vale - Room: 10, Quota: 30");
       assertEquals(expected, onSiteCourse.showInformation());

    }
}
