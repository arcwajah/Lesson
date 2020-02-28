package Lesson15;

import java.util.Arrays;
import java.util.List;

public class Lesson15 {
    public static void main(String[] args) {
        String string1 = new String ("str");
        String string2 = new String ("str");

        System.out.println(string1 == string2);
        System.out.println(string1.compareTo(string2));
        System.out.println(string1.equals(string2));
        System.out.println("-----------------------------------");

        String string11 = new String ("AAAb");
        String string21 = new String ("AAAB");
        System.out.println(string11.compareTo(string21));
        System.out.println("Ignire case = " + string11.equalsIgnoreCase(string21));
        System.out.println("-----------------------------------");

        //String pool:
        String string12 = "str";
        String string22 = "str";
        System.out.println(string12 == string22);
        System.out.println("Immutability-----------------------------------");

        String string13 = "str";
        string13 = string13 + "^" + string12;
        System.out.println("After concatenation:" + string13);

        StringBuilder stringBuilder = new StringBuilder(string13);
        for (int i = 0; i <30000000; i++) {
            stringBuilder.append("WETRREWTREW" + i);
        }
        System.out.println(stringBuilder.toString());

        //Trim:
        String stringToTrim = "        jhak       ";
        System.out.println("\"" + stringToTrim + "\"");
        System.out.println("\"" + stringToTrim.trim() + "\"");
        System.out.print("New line symbol: \t");
        System.out.print("New line symbol: \n");

        //Char at, index of
        String forCharAt = "ABCDEF";
        System.out.println("3 Char at in " + forCharAt + ": " + forCharAt.charAt(3));
        System.out.println("2 Index of in " + forCharAt + ": " + forCharAt.indexOf("Z"));

        //SubString:
        String subString = "Hello Nik!";
        System.out.println("Person name:" + subString.substring(6, 9));
        System.out.println("Person name:" + subString.substring(6));

        //Replace:
        String forReplace = "XYZZYXXZVZDZZK";
        System.out.println("Before replace" + forReplace);
        System.out.println("After replace" + forReplace.replace('Z', '#'));

        //Contains
        String forContains = "ABCD";
        System.out.println(forContains + "contains A:" + forContains.contains("A"));
        System.out.println(forContains + "contains CD:" + forContains.contains("CD"));
        System.out.println(forContains + "contains BD:" + forContains.contains("BD"));

        //Start with
        String forStartsWith = "ABCD";
        System.out.println(forStartsWith + "start with A:" + forStartsWith.startsWith("A"));
        System.out.println(forStartsWith + "start with B:" + forStartsWith.startsWith("B"));

        //Split
        String forSplit = "Hello-my-friend!";
        String[] split = forSplit.split("-");
        List<String> list = Arrays.asList(split);

        list.forEach(w-> System.out.println(w));
        list.forEach(System.out::println);

        list.forEach(w -> w.length());
        list.forEach(String::length);


    }
}
