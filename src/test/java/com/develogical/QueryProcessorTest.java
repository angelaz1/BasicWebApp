package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutHonk() throws Exception {
        assertThat(queryProcessor.process("Honk"), containsString("honk"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("Angela"));
    }

    @Test
    public void knowsAddition() throws Exception {
        assertThat(queryProcessor.process("what is 20 plus 30"), containsString("50"));
    }

    @Test
    public void knowsLargest() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 20, 30, 50"), containsString("50"));
    }
}
