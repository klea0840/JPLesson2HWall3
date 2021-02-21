package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void doubleValues(List<String> s) {
        String newString;
        String str = "";

        // TODO: найти ошибку внутри этого цикла
        for (int i = 0; i < s.size(); i++) {
            newString = s.get(i);
            for (int j = 0; j < newString.length(); j++) {
                char c = newString.charAt(j);
                str = String.valueOf(c) + Character.toString(c);
            }
            s.set(i, str);
        }
        System.out.println(s);

        for (String string:
             s) {
            System.out.println(string);
        }
    }
    public static void main(String[] args) {
        String str;
        List<String> stringList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            str = sc.nextLine();
            stringList.add(i, str);
            // Можно просто stringList.add(str), так ты добавляешь в конец списка
        }
        System.out.println(stringList);

        doubleValues(stringList);
    }
    }

