package com.frankchoi.sumkata;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void 빈스트링_더해보기() throws Exception {
        assertEquals("0", SumUtil.sum("",""));
    }

    @Test
    public void 일과일을_더해보기() throws Exception {
        assertEquals("2", SumUtil.sum("1", "1"));
    }

    @Test
    public void 숫자아닌스트링과_일더해보기() throws Exception {
        assertEquals("1", SumUtil.sum("abcd", "1"));
    }

    @Test
    public void 숫자아닌스트린간_더해보기() throws Exception {
        assertEquals("0", SumUtil.sum("abcd", ""));
    }
}