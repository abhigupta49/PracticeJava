import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApi {
    public static void main(String[] args) {
//        Problem: Given a list of integers, return a list containing only even numbers.

        List<Integer> numbers = Arrays.asList(1,2,3,5,6,9,6,1,1,8,7,4,3,2,22,3,4,5,6,7,8,9);
//
//        List<Integer> evenNumbers = numbers.stream().filter(n -> n%2 == 0).toList();
//        for(int i : evenNumbers){
//            System.out.println(i);
//        }

//        Problem: Find the maximum value in a list of integers.
//        Optional<Integer> max = numbers.stream().max(Integer::compare);
//        Optional<Integer> max = numbers.stream().max((a,b)->Integer.compare(a,b));
//        System.out.println(max.get());

//        Problem: Calculate the sum of elements in a list of integers.
//        java.util.stream.IntStream intStream = numbers.stream().mapToInt(Integer :: intValue);
//        System.out.println(intStream.max());

//        Problem: Convert all strings in a list to uppercase.
//        List<String> names = Arrays.asList("Alice","Bob","Charlie");
//        List<String> upperCase = names.stream().map(String::toUpperCase).toList();
//        for(String str : upperCase){
//            System.out.println(str);
//        }

//        Problem: Sort a list of integers in ascending order
//        List<Integer> sortedNumbers = numbers.stream().sorted((a,b) -> b - a).toList();
//        for(Integer num : sortedNumbers){
//            System.out.println(num);
//        }

//        Problem: Count the number of elements in a list that are greater than 5.

//        long countNum = numbers.stream().filter(n -> n>5).count();
//        System.out.println(countNum);

//        Problem: Get a list of distinct elements from a list of integers.
//         List<Integer> distinctNumber = numbers.stream().distinct().toList();
//         for (int num : distinctNumber){
//             System.out.println(num);
//         }

//        Problem: Reduce a list of integers to their sum.
//        int total = numbers.stream().reduce(0,(a,b)-> a+b);
//        System.out.println(total);

//        Problem: Return any element from a list of integers
//        Optional<Integer> anyElement = numbers.stream().findAny();
//        System.out.println(anyElement.get());

//        Problem: Extract first names from a list of full names.
        List<String> names = Arrays.asList("Charlie Kumar","Bob Kumar","Harris Dutta","Amit Roy");
        List<String> firstName = names.stream().map(name ->name.split(" ")[0]).toList();
        System.out.println(firstName);
    }
}
