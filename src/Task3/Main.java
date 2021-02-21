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
    // TODO: вынести в этот метод ввод списка чисел
    private static List<Integer> getIntegerList (Integer n, List<Integer> list) {
        list.add(n);
        return list;
    }

    /* По этому методу несколько замечаний:
    * 1) обычно, когда говорят "Найти...", это означает "вернуть".
    * TODO: переписать метод так, чтобы он возвращал нужное число;
    * 2) для того чтобы найти минимум, сортировать массив не надо, т.е.
    *    сортировка здесь не нужна, к тому она замедляет работу;
    * TODO: убрать сортировку;
    * 3) несущественно: понятно, что ты хотела попробовать max(), но в
    *    финальном варианте лучше убрать лишнее.
    * */
    private static void getMinimum (List list) {
        Collections.sort(list);
        System.out.println("The min is " + Collections.min(list));
        System.out.println("The min is " + Collections.max(list));
    }
    public static void main(String[] args) {
        Integer number;
        List<Integer> stringList = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        // TODO: в условии задачи нужно считать число N, а затем ввести
        //  N значений. У тебя сейчас вводятся только 3. Нужно поправить
        for (int i = 0; i < 3; i++) {
            number = sc.nextInt();
            getIntegerList(number, stringList);
        }
        System.out.println(stringList);

        getMinimum(stringList);

    }
}

