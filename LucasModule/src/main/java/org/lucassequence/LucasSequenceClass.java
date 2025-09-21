package org.lucassequence;

/**
 * Класс ряду Люка, що розташований в LucasSequenceClass.java
 */
public class LucasSequenceClass {
    /**
     * Масив чисел
     */
    long[] lucasnumbers;

    /**
     * Варіант порожнього конструктора
     */
    LucasSequenceClass () {
    }

    /**
     * Варіант конструктора з параметрами
     * @param n кількість чисел в ряду Люка
     */
    LucasSequenceClass (int n) {
        initNumbers(n);
    }

    /**
     * Ініціалізація ряду Люка
     * @param count кількість чисел в ряду Люка
     */
    void initNumbers(int count) {
        lucasnumbers = new long [count];
        lucasnumbers[0] = 2;
        lucasnumbers[1] = 1;
        for (int i = 2; i < count; i++) {
            lucasnumbers[i] = lucasnumbers[i-2] + lucasnumbers[i-1];
        }
    }

    /**
     * Вивід чисел ряду Люка
     */
    void printNumbers() {
        for (int i = 0; i < lucasnumbers.length; i++) {
            System.out.println("lucas[" + i + "] = " + lucasnumbers[i]);
        }
    }

    /**
     * Перевірка чисел на відповідність формулі (w^2)+1
     */
    void squaredNumbersPlusOne() {
        for (int i = 0; i < lucasnumbers.length; i++) {
            double w = Math.sqrt(lucasnumbers[i] - 1);
            if (w - Math.floor(w) == 0) {
                System.out.printf("lucas[%d] = %d, w = %.0f%n", i, lucasnumbers[i], w);
            }
        }
    }

    /**
     * Додаткова функція для знаходження індексу числа
     * @param num число, для якого буде здійснено пошук індексу
     */
    void reutrnIndex(long num) {
        boolean isfound = false;
        for (int i = 0; i < lucasnumbers.length; i++) {
            if (lucasnumbers[i] == num) {
                System.out.println("lucas = " + lucasnumbers[i] + ", index = " + i);
                isfound = true;
                return;
            }
        }
        if (!isfound) {
            System.out.println("Такого числа немає!");
        }
    }

    /**
     * Додаткова функція для знаходження числа за індексом
     * @param index індекс, за яким буде здійснено пошук числа
     */
    void findByIndex(int index) {
        if (!(index >= lucasnumbers.length) && !(index < 0)) {
            System.out.println("lucas[" + index + "] = " + lucasnumbers[index]);
        }
        else {
            System.out.println("Немає числа з таким індексом!");
        }
    }
}