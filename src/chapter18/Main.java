package chapter18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("list: " + numbers);
        numbers.add(3, 7);
        System.out.println("add 7: " + numbers);
        numbers.remove(2);
        System.out.println("remove 2: " + numbers);
        List<Integer> list1 = numbers.subList(0, 3);
        System.out.println("list1: " + list1);
        list1.replaceAll(x -> x + 10);
        System.out.println("list1 before lambda: " + list1);
        System.out.println("numbers before lambda: " + numbers);
        numbers.sort(Integer::compareTo);
        System.out.println("numbers sort :" + numbers);
    }
}
