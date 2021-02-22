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

        /* В то время как оборачивание ввода в try-catch во многих случаях
        * является хорошей идеей , здесь она задействована как-то странно. По
        * сути единственное исключение, которое этот блок пытается поймать
        * в catch, сигнализирует об окончании ввода. По большому счету, тут
        * try-catch не нужен. Здесь проще будет выйти из цикла, в котором
        * вводятся строки, с помощью break.*/
        // TODO:
        //  1) убрать try-catch;
        // done
        //  2) вынести вывод строк из тела цикла, в котором вводятся строки.
        while (sc.hasNext()) {
                String stringList = (String) sc.nextLine();
    //            System.out.println(strings);

                /* Попробуй вынести вывод строк за пределы try-catch. Чтобы
                * в этом цикле только ввод был. А в другом (в конце программы) -
                * только вывод. Это помогает упростить код и делает его более
                * понятным. */
                if (stringList.equalsIgnoreCase(end)) {
                    sc.close();
                    break;
                } else {
                    strings.add(stringList);
    //                sc.nextLine();
                }
            }

        for (String s : strings) {
            System.out.println(s);
        }

    }
}

