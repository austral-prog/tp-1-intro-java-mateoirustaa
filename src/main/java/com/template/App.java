package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        if (b > a) {
            return b;
        }
        return 0;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        int contador = 1;
        for (int i = 1; i <= n; i++) {
            contador *= i;
        }
        return contador;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        return reverse;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) sum += array[i];
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
