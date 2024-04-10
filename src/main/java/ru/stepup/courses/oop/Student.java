/*
#3.Создайте класс Студент (Student), которая описывается:

Имя (name): строка
Оценки (grades): массив целых чисел
При создании обязательно указать имя, и опционально набор оценок
Может возвращать текстовое представление вида “Имя: [оценка1, оценка2,…,оценкаN]” (toString)
Оценки можно добавлять в любой момент, но нельзя удалять
Все оценки должны быть в диапазоне от 2 до 5
Весь набор оценок можно получить в любой момент
Задача считается решенной корректно, если выполняются требования инкапсуляции.
 */

package ru.stepup.courses.oop;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades = new int[5];

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] == 0) {
                    grades[i] = grade;
                    return;
                }
            }
            throw new IllegalArgumentException("Все оценки заполнены!");
        } else {
            throw new IllegalArgumentException("Все оценки должны быть в диапазоне от 2 до 5!");
        }
    }

    public int[] getGrades() {
        return grades;
    }

    public String toString() {
        return name + " " + Arrays.toString(grades);
    }
}