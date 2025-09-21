package org.lucassequence;
import java.util.Scanner;

/**
 * Головний клас програми, що розташований в Main.java
 */
public class Main {
    /**
     * Головна функція програми
     */
    public static void main(String[] args) {
        try {
            System.out.println("Лаборнаторна робота №1. Основи Java\n" +
                    "Виконала Жандик О. А. ОІ-11сп, варіант 8\n" +
                    "------------------------------------------------------------------");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть кількість N чисел в ряду Люка: ");
            int n = scanner.nextInt();

            if (n <= 90) {
                LucasSequenceClass lucas = new LucasSequenceClass(n);
                System.out.println("----------------------------Числа Люка----------------------------");
                lucas.printNumbers();
                System.out.println("------------------------------------------------------------------");
                System.out.print("1 - Числа ряду Люка, що є на 1 більшими за квадрат числа w\n" +
                        "2 - Пошук індекса за числом\n" +
                        "3 - Пошук числа за індексом\n" +
                        "Оберіть: ");
                int var = scanner.nextInt();
                System.out.println("------------------------------------------------------------------");
                switch (var) {
                    case 1:
                        lucas.squaredNumbersPlusOne();
                        break;
                    case 2:
                        System.out.print("Введіть число: ");
                        int number = scanner.nextInt();
                        lucas.reutrnIndex(number);
                        break;
                    case 3:
                        System.out.print("Введіть індекс: ");
                        int index = scanner.nextInt();
                        lucas.findByIndex(index);
                        break;
                    default:
                        System.out.print("Такого варіанту немає!");
                        break;
                }
            }
            else {
                System.out.println("Максимальне значення N = 90, так як максимальне значення long змінної = 9,223,372,036,854,775,807");
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}