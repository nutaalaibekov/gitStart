package kg.itacademy.lesson33;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        int sumArray = 0;
        int sumHashSet = 0;
        for(int i = 0; i < 400; i++) {
            int current = rnd.nextInt(100 + 1- 1) + 1;
            arrayList.add(current);
            hashSet.add(current);
            sumArray += current;
        }

        for(Integer item : hashSet) {
            sumHashSet += item;
        }

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(sumArray);
        System.out.println(sumArray);
        System.out.println("___________________________________________");
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(sumHashSet);




    }
}
