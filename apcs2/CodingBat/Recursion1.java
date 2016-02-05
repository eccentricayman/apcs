public class Recursion1 {
    public static int factorial(int n) {
        int x = n;
        if (x > 1) {
            return factorial(x-1) * x;
        }
        else {
            return x;
        }
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        else {
            return bunnyEars(bunnies - 1) + 2;
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } 
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        else {
            if (bunnies % 2 == 0) {
                return bunnyEars2(bunnies - 1) + 3;
            }
            else {
                return bunnyEars2(bunnies - 1) + 2;
            }
        }
    }

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }
        else {
            return triangle(rows - 1) + rows;
        }
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return sumDigits(n / 10) + (n % 10);
        }
    }
    
    public static int count7(int n) {
        if (n == 7) {
            return 1;
        }
        else if (n == 0) {
            return 0;
        }
        else if (n != 7 && n < 10) {
            return 0 ;
        }
        else {
            return count7(n / 10) + count7(n % 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(count7(717));
        System.out.println(count7(7));
        System.out.println(count7(123));
    }
}
