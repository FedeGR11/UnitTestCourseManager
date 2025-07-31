package com.test.Suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.coursemanagement.*;



@Suite
@SelectClasses({
    CourseTest.class,
    OnlineCourseTest.class,
    OnSiteCourseTest.class
})

public class AllTestsSuite {
}


