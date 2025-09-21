package org.lucassequence;

public class LucasSequenceClass {
    long[] lucasnumbers;

    LucasSequenceClass () { //варіант порожнього конструктора
    }

    LucasSequenceClass (int n) { //варіант конструктора з параметрами
        initNumbers(n);
    }

    void initNumbers(int count) { //ініціалізація ряду Люка
        lucasnumbers = new long [count];
        lucasnumbers[0] = 2;
        lucasnumbers[1] = 1;
        for (int i = 2; i < count; i++) {
            lucasnumbers[i] = lucasnumbers[i-2] + lucasnumbers[i-1];
        }
    }
    void printNumbers() { //вивід чисел
        for (int i = 0; i < lucasnumbers.length; i++) {
            System.out.println("lucas[" + i + "] = " + lucasnumbers[i]);
        }
    }

    void squaredNumbersPlusOne() { //перевірка чисел на відповідність формулі (w^2)+1
        for (int i = 0; i < lucasnumbers.length; i++) {
            double w = Math.sqrt(lucasnumbers[i] - 1);
            if (w - Math.floor(w) == 0) {
                System.out.printf("lucas[%d] = %d, w = %.0f%n", i, lucasnumbers[i], w);
            }
        }
    }

    void reutrnIndex(long num) { //додаткова функція знаходження індексу числа
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

    void findByIndex(int index) { //додаткова функція знаходження числа за індексом
        if (!(index >= lucasnumbers.length) && !(index < 0)) {
            System.out.println("lucas[" + index + "] = " + lucasnumbers[index]);
        }
        else {
            System.out.println("Немає числа з таким індексом!");
        }
    }
}