package io.web.controller;

import org.junit.*;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.util.MatcherAssertionErrors.assertThat;

public class HelloControllerTest {

    @Test
    public void name() {
        assertThat(true, is(true));
    }
}