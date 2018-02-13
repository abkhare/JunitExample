package com.abhi.junittestcaseexample;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by abhi on 2/9/18.
 */

public class AssertThatUnitTest {

    @BeforeClass
    public static void testClassSetup() throws Exception {
        // This method executes only once nad before all test methods.
    }

    @AfterClass
    public static void testClassTearDown() throws Exception {
        // This method executes only once and after all test methods.
    }

    @Before
    public void testSetup() throws Exception {
        // This method executes before each test method in the class.
    }

    @After
    public void testTearDown() throws Exception {
        // This method executes after each test method in the class.
    }

    @Test
    public void assertThatTestTrue() throws Exception {

        // assertThat from Junit 4 is better than old assertions, because they are more readable and give proper failure message.
        // This is equivalent to assertEquals
        assertThat(8, is( equalTo(4 +4) ) );
    }

    @Test
    public void assertThatTestFalse() throws Exception {

        // assertThat from Junit 4 is better than old assertions, because they are more readable and give proper failure message.
        // This is equivalent to assertFalse
        assertThat(4, is( not( equalTo(4 +4))));

    }

    @Test
    public void testClassName() throws Exception {

        MainActivity mainActivity = new MainActivity();
        assertThat("MainActivity", is( equalTo(mainActivity.getMyName()) ) );
    }
}
