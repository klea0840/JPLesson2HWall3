package AdditionalTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        String end = "end";

        Scanner sc = new Scanner(System.in);

        try {
        while (sc.hasNext()) {
            String stringList = (String) sc.nextLine();
//            System.out.println(strings);

            if (stringList.equalsIgnoreCase(end)) {
                sc.close();
                Iterator<String> iter = strings.listIterator();
                while (iter.hasNext()) {
                    String s = iter.next();
                    System.out.println(s);
                }
                throw new Exception("The end");
                } else {
                strings.add(stringList);
//                sc.nextLine();
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

