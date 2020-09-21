package com.trf;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloWord {
    @Test
    public void testsum() {
        HelloWord helloWord = new HelloWord();
        int sum = helloWord.sum(10, 20);
        Assert.assertEquals(30, sum);
    }
}
