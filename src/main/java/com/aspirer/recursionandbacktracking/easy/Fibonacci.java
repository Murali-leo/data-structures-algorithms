package com.aspirer.recursionandbacktracking.easy;

public class Fibonacci {
    public int fibonacci(int n) {
        if(n == 1 || n ==0) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
     }

     public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        int n = 6;
        System.out.println("Fibonacci of " + n + " is: " + fib.fibonacci(n));
     }
}
