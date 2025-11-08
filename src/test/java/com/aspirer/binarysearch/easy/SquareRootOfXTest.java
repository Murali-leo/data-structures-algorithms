package com.aspirer.binarysearch.easy;

import org.junit.jupiter.api.Test;

public class SquareRootOfXTest {
    SquareRootOfX squareRootOfX = new SquareRootOfX();

    @Test
    public void testMySqrt() {
        assert squareRootOfX.mySqrt(0) == 0 : "Test failed for input 0";
        assert squareRootOfX.mySqrt(1) == 1 : "Test failed for input 1";
        assert squareRootOfX.mySqrt(4) == 2 : "Test failed for input 4";
        assert squareRootOfX.mySqrt(8) == 2 : "Test failed for input 8";
        assert squareRootOfX.mySqrt(16) == 4 : "Test failed for input 16";
        assert squareRootOfX.mySqrt(25) == 5 : "Test failed for input 25";
        assert squareRootOfX.mySqrt(2147395599) == 46339 : "Test failed for input 2147395599";
    }
}
