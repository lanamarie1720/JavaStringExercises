package se.lexicon;

public class StringExercises {

    public static void main(String[] args) {
       ex7();
    }

// Ex 1: What is the length of the String: "Java"?
private static void ex1() {
    String str1 = "Java";
    System.out.println("1. Length of the String: " + str1.length());
    }

    // Ex 2: What char is at index position 6 in the following String: "Long example sentence"?
    private static void ex2() {
        String str2 = "Long example sentence";
        char charAtIndex6 = str2.charAt(6);
        System.out.println("2. Char at index 6: " + charAtIndex6);
    }

    // Ex 3: What is the index position of 'o' in the following String: "Even longer example sentence"?
    private static void ex3() {
        String str3 = "Even longer example sentence";
        int indexOf0 = str3.indexOf('o');
        System.out.println("3. Index of 'o': " + indexOf0);
    }

    // Ex 4: Given the following String: "Ok this is not as long!", create a substring of only "not as long" (excluding the exclamation point) and print it out.
    private static void ex4() {
        String str4 = "Ok this is not as long!";
        String subString = str4.substring(str4.indexOf("not"), str4.indexOf("!"));
        System.out.println("4. Substring: " + subString);
    }

    // Ex 5: Convert the following String: "CAPS EQUALS SCREAMING!" to lowercase and print it out. Then convert it back to uppercase and print it out again.
    private static void ex5() {
        String str5 = "CAPS EQUALS SCREAMING";
        str5 = str5.toLowerCase();
        System.out.println("Lowercase: " + str5);
        str5 = str5.toUpperCase();
        System.out.println("Uppercase (Original): " + str5);
    }

    // Ex 6: What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?
    private static void ex6() {
        String str6 = "\tJ\ta\tv\ta\t";
        String trimmedStr6 = str6.trim();
        System.out.println("6. Trimmed String: " + trimmedStr6);
    }

    // Ex 7. Parse the following int: 20 to a String and add a 20 to the end of the String. Printing it out should return: "2020".
    private static void ex7() {
        int  number = 20;
        String str7 = String.valueOf(number) + "20";
        System.out.println("7. Combined String: " + str7);
    }

    // Ex 8. Oil and water don't go well together. Given the String: "Oil and Water", split them up into the words "Oil", "Water" and store them in a String array.
    private static void ex8() {
      String str8 = "Oil and Water";
      String[] words = str8.split(" ");
        System.out.println("8. Words: " + words[0] + ", " + words[1]);
    }

    // Ex 9: Split the following String: "Carl,Susie,Fredrick,Bob,Erik" into an array. Print out all names separately.
    private static void ex9() {
        String str9 = "Carl,Susie,Fredrik,Bob,Erik";
        String[] names = str9.split(",");
        System.out.println("9. Names:");
        for (String name : names) {
            System.out.println(" " + name);
        }
    }

    // Ex 10: Convert the following String: "ThisShouldBeConverted" to a char array. Iterate through the char array and print out each element.
    private static void ex10() {
        String str10 = "ThisShouldBeConverted";
        char[] charArray = str10.toCharArray();
        System.out.println("10. Char Array:");
        for (char ch : charArray) {
            System.out.println(" " + ch);
        }
    }

    // Ex 11: Convert the following char[]: {'J','a','v','a'} to a String and print it out.
    private static void ex11() {
        char[] charArray11 = {'J', 'a', 'v', 'a'};
        String convertedString = new String(charArray11);
        System.out.println("11. Converted String: " + convertedString);
    }
}