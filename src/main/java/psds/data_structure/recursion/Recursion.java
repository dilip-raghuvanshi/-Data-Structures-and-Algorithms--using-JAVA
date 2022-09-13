package psds.data_structure.recursion;

import com.sun.org.glassfish.external.amx.MBeanListener;

import javax.security.auth.callback.Callback;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class Recursion {
    public static void main(String[] args) {
        Recursion rc = new Recursion();
        //System.out.println(rc.sumOfDigits(-78));
        //System.out.println(rc.power(-2, -3));
        //System.out.println(rc.gcd(45,150));
        //System.out.println(rc.decimalToInt(-78));
        //System.out.println(rc.factorial(4));
        int arr[] = {1, 2, 3, 4, 5};
        //System.out.println(rc.productOfArray(arr, 5));
        //System.out.println(rc.fibonacciNumber(6));
        //System.out.println(rc.reverse("java"));
        //System.out.println(rc.isPalindrome("aba"));
        //System.out.println(rc.first("aba"));
        System.out.println(rc.capitalizeWord("i"));
    }

    public int sumOfDigits(int number) {
        if (number <= 0)
            return 0;
        return number % 10 + sumOfDigits(number / 10);
    }

    public int power(int base, int exp) {
        if (exp < 0)
            return -1;
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }

    public int gcd(int a, int b) {
        if (a < 0 || b < 0)
            return -1;
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public int decimalToInt(int n) {
        if (n < 0)
            return -1;
        if (n == 0)
            return 0;
        return n % 2 + 10 * decimalToInt(n / 2);
    }

    public int factorial(int num) {
        if (num < 0)
            return -1;
        if (num <= 1)
            return 1;
        return num * factorial(num - 1);
    }

    public int productOfArray(int A[], int N) {
        if (N < 1)
            return 1;
        return A[N - 1] * productOfArray(A, N - 1);
    }

    public int fibonacciNumber(int n) {
        if (n < 0)
            return -1;
        if (n == 0 || n == 1)
            return n;
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    public String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));
        return false;
    }

    public boolean someRecursive(int[] arr, Callable odd) {
        if (arr.length == 0)
            return false;
        // if (odd.run(arr[0]))
        //return true;
        return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
    }

    public char first(String str) {
        if (str.isEmpty())
            return ' ';
        if (Character.isUpperCase(str.charAt(0)))
            return str.charAt(0);
        return first(str.substring(1));
    }

    public String capitalizeWord(String str) {
        if (str.isEmpty())
            return str;
        char chr = str.charAt(str.length() - 1);
        if (str.length() == 1)
            return Character.toString(Character.toUpperCase(chr));
        char chr2 = str.charAt(str.length() - 2);
        if (chr2 == ' ')
            return capitalizeWord(str.substring(0, str.length() - 2)) + Character.toString(chr2) + Character.toUpperCase(chr);
        return capitalizeWord(str.substring(0, str.length() - 1)) + Character.toString(chr);
    }

}
