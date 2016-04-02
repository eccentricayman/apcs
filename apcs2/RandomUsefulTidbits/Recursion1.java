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

    public static int count8(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n % 10 == 8 && (n / 10) % 10 == 8) {
            return 2 + count8(n / 10);
        }
        else if (n % 10 == 8) {
            return 1 + count8(n / 10);
        }
        else {
            return count8(n / 10);
        }
    }

    public static int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return powerN(base, n - 1) * base;
        }
    }

    public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.length() == 1) {
            if (str.substring(0, 1).equals("x")) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            return countX(str.substring(0, 1)) + countX(str.substring(1, str.length()));
        }
    }

    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        else if (str.length() == 2) {
            if (str.equals("hi")) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            return countHi(str.substring(0, 2)) + countHi(str.substring(1, str.length()));
        }
    }

    public static String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        }
        else if (str.length() == 1) {
            if (str.equals("x")) {
                return "y";
            }
            else {
                return str;
            }
        }
        else {
            return changeXY(str.substring(0, 1)) + changeXY(str.substring(1, str.length()));
        }
    }

    public static String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }
        else if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2));
        }
        return str.substring(0, 1) + changePi(str.substring(1));
    }

    public static String noX(String str) {
        if (str.length() == 0) {
            return str;
        }
        else if (str.length() == 1) {
            if (str.equals("x")) {
                return "";
            }
            else {
                return str;
            }
        }
        else {
            return noX(str.substring(0, 1)) + noX(str.substring(1));
        }
    }

    public static boolean array6(int[] nums, int index) {
        if (nums.length == 0) {
            return false;
        }
        if (index + 1 == nums.length) {
            return nums[index] == 6;
        }
        if (nums[index] == 6) {
            return true;
        }
        else {
            return array6(nums, index + 1);
        }
    }

    public static int array11(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }
        if (nums[index] == 11) {
            return 1 + array11(nums, index + 1);
        }
        return array11(nums, index + 1);
    }

    public static boolean array220(int[] nums, int index) {
        if (index + 2 == nums.length) {
            return false;
        }
        if (nums[index] * 10 == nums[index + 1]) {
            return true;
        }
        return array220(nums, index + 1);
    }
    
    public static void main(String[] args) {
        System.out.println("You should probably test something here.");
    }
}
