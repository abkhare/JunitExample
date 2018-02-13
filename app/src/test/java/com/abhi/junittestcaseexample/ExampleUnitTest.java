package com.abhi.junittestcaseexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

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
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}