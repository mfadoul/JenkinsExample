package org.simple.jenkinsexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JenkinsExampleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testJenkinsExample() {
		JenkinsExample jenkinsExample = new JenkinsExample();
		assertNotNull(jenkinsExample);
	}

	@Test
	public final void testToString() {
		assertTrue(true);
	}

}
