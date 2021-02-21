package Task3;

import java.util.*;

public class Main {

    private static List<Integer> getIntegerList (Integer n, List<Integer> list) {
        list.add(n);
        return list;
    }

    private static void getMinimum (List list) {
        Collections.sort(list);
        System.out.println("The min is " + Collections.min(list));
        System.out.println("The min is " + Collections.max(list));
    }
    public static void main(String[] args) {
        Integer number;
        List<Integer> stringList = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            number = sc.nextInt();
            getIntegerList(number, stringList);
        }
        System.out.println(stringList);

        getMinimum(stringList);

    }
}

