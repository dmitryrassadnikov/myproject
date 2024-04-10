/*
#6.Разработайте метод (sumAll), который принимает набор числовых значений и возвращает их сумму в вещественной форме.

С использованием данного метода выполните следующие сложения:
2 + 3/5 + 2.3
3.6 + 49/12 + 3 + 3/2
1/3 + 1
 */

package ru.stepup.courses.ooppolim;

public class SumAll {

    public static void main(String[] args) {
        System.out.println("Результат сложения: 2 + 3/5 + 2.3 = " + sumAll(new double[]{2, (double) 3 / 5, 2.3}));
        System.out.println("Результат сложения: 3.6 + 49/12 + 3 + 3/2 = " + sumAll(new double[]{3.6, (double) 49 / 12, 3, (double) 3 / 2}));
        System.out.println("Результат сложения: 1/3 + 1 = " + sumAll(new double[]{(double) 1 / 3, 1}));
    }

    public static double sumAll(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}




