package com.oocode;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class ExampleTest {
	@Test 
	public void n() {
		assertThat(new Example().fizzbuzz(1), is("1"));
		assertThat(new Example().fizzbuzz(3), is("fizz"));
	}
}
