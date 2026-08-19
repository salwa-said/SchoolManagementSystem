package utils;

import java.util.List;

public class HelperUtils {
    private static int counter = 1;

    //empty checks: for text
    public static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
    //empty checks: for collection
    public static boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }
    //positive checks: for a whole number
    public static boolean isPositive(int n) { return n > 0; }


    //positive checks:  for a decimal.
    public static boolean isPositive(double n) { return n > 0; }


    public static boolean isValidString(String s) { return !isEmpty(s); }
    public static boolean isValidString(String s, int minLength) {
        return !isEmpty(s) && s.trim().length() >= minLength;
    }
    public static boolean isValidString(String s, int min, int max) {
        return !isEmpty(s) && s.trim().length() >= min && s.trim().length() <= max;
    }
    // id generation: no prefix
    public static String generateId() {
        return "ID-" + (counter++);
    }
    public static String generateId(String prefix) {
        return prefix + "-" + (counter++);
    }


    public static boolean isValidNumber(int n, int min, int max) {
        return n >= min && n <= max;
    }
    public static boolean isValidNumber(double n, double min, double max) {
        return n >= min && n <= max;
    }

    //isValidAge (0–120);
    public static boolean isValidAge(int age) {
        return age >= 0 && age <= 120;
    }
}
