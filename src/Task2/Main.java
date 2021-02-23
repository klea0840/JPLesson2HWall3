package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void doubleValues(List<String> s) {
        String newString;
        String str = "";
        List<String> newList = new ArrayList<>();

        // TODO: найти ошибку внутри этого цикла
        //  Сейчас ты получаешь массив сдвоенных символов, т.е. при
        //  вводе "abc" и "def" ты выводишь [aa, bb, cc, dd, ee, ff].
        //  Сделай так, чтобы при вводе "abc" и "def" выводилось
        //  [aabbcc, ddeeff], т.е. символы были сгруппированы по словам.
        //  Т.е. тебе надо взять строку из списка, удвоить ее символы и
        //  только потом запихивать в newList.
        for (int i = 0; i < s.size(); i++) {
            newString = s.get(i);
            for (int j = 0; j < newString.length(); j++) {
                char c = newString.charAt(j);
                str += String.valueOf(c) + String.valueOf(c);
            }
            newList.add(str);
            str = "";
        }
        System.out.println(newList);

        for (String string:
             newList) {
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

