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
            query = query.substring("what is ".length(), query.length());
            String[] a = query.split(" plus ");
            return Integer.toString(Integer.parseInt(a[0]) + Integer.parseInt(a[1]));
        }
        return "";
    }
}
