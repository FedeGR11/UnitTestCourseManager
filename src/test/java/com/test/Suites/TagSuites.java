package com.test.Suites;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;


@Suite
@SelectPackages("com.coursemanagement")
@IncludeTags({"regression"})
@ExcludeTags({"smoke"})

public class TagSuites {
    
}
