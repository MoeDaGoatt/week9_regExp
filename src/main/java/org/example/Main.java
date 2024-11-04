package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final String regex = "[abc]";
        final String string = "The Bachelor of Science in Artificial Intelligence Management is designed to meet both transfer and continuing education needs for students, preparing them for a wide range of careers in the emerging field of AI. This program builds a foundation of both managerial and technical skills by combining business and computer science to understand, develop and manage AI applications. In particular, the program builds technical skills in machine learning and management, enabling the student to apply those skills in areas such as marketing, finance, supply chain, and other business functions. In addition, with courses on ethics and the societal implications of AI, the program reflects perspectives that are both diverse and international. The program is ideal for students with backgrounds in computer science and interested in learning more about the application of AI in business, and for students with backgrounds in business and interested in learning more about the technical aspects of AI. 10-20-2024, R02339482\n\n";
        final String subst = "X";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        // The substituted value will be contained in the result variable
        final String result = matcher.replaceAll(subst);

        System.out.println("Substitution result: " + result);
    }
}