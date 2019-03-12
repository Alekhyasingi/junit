package com.test.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ RectangleAreaTest.class, SquareAreaTest.class })
public class AllTests {

}
