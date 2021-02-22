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
    private static List<Integer> getIntegerList (Integer n,  List<Integer> listInt) {
        Integer num;

        System.out.println("Enter " + n + " number(s)");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            listInt.add(num);
        }
        return listInt;
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
    private static Integer getMinimum (List<Integer> list) {
        Integer min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i));
        }
        return min;
    }
    public static void main(String[] args) {
        Integer number;
        List<Integer> listInt = new LinkedList<>();

        // TODO: в условии задачи нужно считать число N, а затем ввести
        //  N значений. У тебя сейчас вводятся только 3. Нужно поправить
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number");
        number = (Integer) sc.nextInt();

        System.out.println("The number is " + number);

        getIntegerList(number, listInt);

        System.out.println(listInt);

        System.out.println("The min value: " + getMinimum(listInt));
    }
}

