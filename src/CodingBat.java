public class CodingBat {
    //Warmup-1: makes10
    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) {
            return true;
        } else {
            return false;
        }
    }

    //Warmup-2:doublex
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) {
            return false;
        }
        if (i + 1 >= str.length()) {
            return false;
        } else {
            return str.substring(i + 1, i + 2).equals("x");
        }
    }

    //String-1:helloName
    public String helloName(String name) {
        return ("Hello " + name + "!");
    }

    //Array-1: no23
    public boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            return false;
        } else {
            return true;
        }
    }

    //Logic-1: love6
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6 || (a + b) == 6 || (a - b) == 6 || (b - a) == 6) {
            return true;
        } else {
            return false;
        }
    }

    //Logic-2: noTeenSum
    public int noTeenSum(int a, int b, int c) {
        if (a >= 13 && a <= 19 && a != 15 && a != 16) {
            a = 0;
        }
        if (b >= 13 && b <= 19 && b != 15 && b != 16) {
            b = 0;
        }
        if (c >= 13 && c <= 19 && c != 15 && c != 16) {
            c = 0;
        }
        return a + b + c;
    }

    //String-2: countHi
    public int countHi(String str) {
        int num = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                num++;
            }
        }
        return num;
    }

    // String-3: countTriple
    public int countTriple(String str) {
        int num = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2)) && str.substring(i, i + 1).equals(str.substring(i + 2, i + 3))) {
                num++;
            }
        }
        return num;
    }

    //Array-2: lucky 13
    public boolean lucky13(int[] nums) {
        boolean a = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                a = false;
            }
        }
        return a;
    }

    //Array-3: linerarIn
    public boolean linearIn(int[] outer, int[] inner) {
        int num = 0;
        boolean b = false;
        for (int i = 0; i < inner.length; i++) {
            for (int a = 0; a < outer.length; a++) {
                if (inner[i] == outer[a]) {
                    num++;
                    break;
                }
            }
        }
        if (num == inner.length) {
            b = true;
        }
        return b;
    }
}
