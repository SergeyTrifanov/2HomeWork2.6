package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        toDo1();
        System.out.println("-----");
        toDo2();
        System.out.println("-----");
        toDo3();
        System.out.println("-----");
        toDo4();    }

    private static void toDo1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer i : nums) {
            if (Objects.nonNull(i) && i % 2 == 1) {
                System.out.println(i + " ");
            }
        }
    }

    private static void toDo2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>();
        for (Integer i : nums) {
            if (Objects.nonNull(i) && i % 2 == 0) {
                set.add(i);
            }
        }
        for (Integer i : set) {

            System.out.println(i + " ");
        }
    }

    private static void toDo3(){
        List<String> strings = List.of("test", "trgrhf", "TEST", "jkjfhfjd", "test", "test", "Test");
        System.out.println(new HashSet<>(strings));
    }

    private static void toDo4(){
        List<String> strings = List.of("test", "trgrhf", "TEST", "jkjfhfjd", "test", "test", "Test");
        Map<String, Integer> result = new HashMap<>();
        for (String s: strings) {
            if (result.containsKey(s)){
                result.put(s, result.get(s)+ 1);
            } else {
                result.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry: result.entrySet()){
            System.out.println(entry.getKey()+ ">" + entry.getValue());
        }
    }

}
