// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


package HW_4;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HW_1 {

    static Scanner scanner = new Scanner(System.in);

    public static ArrayDeque<String> getReversDeque() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        ArrayDeque<String> reverseDeque = new ArrayDeque<>();

        while (true) {
            System.out.println("Введите строку: ");
            String str = scanner.nextLine();
          
        if (str.isEmpty()) {
            System.out.println("Завершение работы подпрограммы.");
            break;
        } else {
            deque.addLast(str);
            reverseDeque.addFirst(str);
        }
        
    } System.out.println(deque);
    return reverseDeque;
    }

    public static void main(String[] args) {

        System.out.println(getReversDeque());

    }

}
