package ru.stepup.courses.conditions;

public class DelLast {
    public static void main(String[] args) {
        System.out.println(delLast("DMITRD"));
    }

    public static boolean isEqualLastAndFirst(String str) {
        char first = str.charAt(0);
        System.out.println(first);
        char last = str.charAt(str.length() - 1);
        System.out.println(last);
        return first == last;
    }

    public static String delLast(String str) {
        String res;
        System.out.println(str.length() - 1);
        if (isEqualLastAndFirst(str)) {
            res = str.substring(1, str.length() - 1);
        } else {
            res = str + 'f';
        }
        return res;
    }
}