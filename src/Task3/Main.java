package Task3;

import java.util.*;

public class Main {

    /* Из условия задачи:
    * "Считать N целых чисел и заполнить ими список - метод getIntegerList."
    * Здесь подразумевается, что ввод чисел и заполнение списка целиком
    * должны быть внутри метода getIntegerList.
    * Метод должен принимать число N, возвращать заполненный числами список
    * длины N.
    */

    /* Уже лучше. Однако посмотри на сигнатуру этого метода.
     * Сейчас ты получаешь в методе ссылку на готовый список, модифицируешь его и
     * возвращаешь ссылку на него. В программе уже ссылка на этот метод, так что это
     * просто дублирует и запутывает код.
     * Сделай так, чтобы он принимал *только один* аргумент (число N) и возвращал
     * *новый (т.е. созданный внутри самого метода)* список.
     */
    private static List<Integer> getIntegerList (Integer n) {
        Integer num;
        List<Integer> listInt = new LinkedList<>();

        System.out.println("Enter " + n + " number(s)");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            num = (Integer) sc.nextInt();
            listInt.add(num);
        }
        return listInt;
    }

    /*
    * Неплохо. Этот вариант делает свою работу. Но он неоптимален.
    * В предыдущем варианте ты использовала Collections.min().
    * Старайся использовать готовые функции из библиотеки всегда, когда они
    * делают то, что тебе надо (не изобратай велосипед, как говорится).
    */
    private static Integer getMinimum (List<Integer> list) {
//        Integer min = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            min = Math.min(min, list.get(i));
//        }
        Integer min = Collections.min(list);
        return min;
    }

    public static void main(String[] args) {
        Integer number;
        List<Integer> listInt = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number");
        number = (Integer) sc.nextInt();

        System.out.println("The number is " + number);

        System.out.println("The min value: " + getMinimum(getIntegerList(number)));
    }
}

