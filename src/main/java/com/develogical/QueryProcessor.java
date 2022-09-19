package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("honk")) {
            return "Honk! Honk honk honk honk honk!!!";
        }
        if (query.toLowerCase().contains("what is your name")) {
            return "Angela";
        }
        if (query.toLowerCase().contains("plus")) {
            int startIndex = query.indexOf("what", 0);
            query = query.substring(startIndex + "what is ".length(), query.length());
            String[] a = query.split(" plus ");
            return Integer.toString(Integer.parseInt(a[0]) + Integer.parseInt(a[1]));
        }
        if (query.toLowerCase().contains("largest")) {
            int startIndex = query.indexOf("which", 0);
            query = query.substring(startIndex + "which of the following numbers is the largest: ".length(), query.length());
            String[] a = query.split(", ");

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (Integer.parseInt(a[i]) > max) {
                    max = Integer.parseInt(a[i]);
                }
            }
            return Integer.toString(max);
        }
        if (query.toLowerCase().contains("square")) {
            int startIndex = query.indexOf("which", 0);
            query = query.substring(startIndex + "which of the following numbers is both a square and a cube: ".length(), query.length());
            String[] a = query.split(", ");

            String result = "";
            for (int i = 0; i < a.length; i++) {
                int x = Integer.parseInt(a[i]);
                int sq = (int)Math.floor(Math.sqrt(x));
                int cb = (int)Math.floor(Math.cbrt(x));
                if (sq * sq == x && cb*cb*cb == x) {
                    result += Integer.toString(x) + ", ";
                }
            }

            if (result.length() > 0)  {
                result = result.substring(0, result.length() - 2);
            }
            return result;
        }
        return "";
    }
}
