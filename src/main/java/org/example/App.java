package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use the stream API to filter the list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .collect(Collectors.toList()); // Collect result into a new list

        System.out.println(evenNumbers); // Prints: [2, 4, 6, 8, 10]
    }
}
