/**
 * LeetCode Problem: SelfDividingNums
 * Problem Link: https://leetcode.com/problems/self-dividing-numbers/
*/ 
package com.aspirer.arrays;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNums {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> result = new ArrayList<>();

        for(int i = left; i <= right; i++) {
            if(i%10 != 0) {
                if(selfDivided(i)) {
                result.add(i);
            }
            }
            
        }
        return result;
    }

    private boolean selfDivided(int num) {
        int count = 0;
        int temp = num;
        int res = 0;
        while(num > 0) {
            if(((num % 10) != 0) && (temp % (num % 10) == 0)) {
                res++;
            }
            num /= 10;
            count++;
        }
        return count == res ? true : false;
    }
}
