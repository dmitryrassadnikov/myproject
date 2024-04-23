/*
#1.Есть класс Cat:

public class Cat {
   private static String breed = "Persian"; // порода
   public String name;
   private int age;
   private List friendsName = new ArrayList<>();

   public Cat(String name, int age, List friendsName) {
       this.name = name;
       this.age = age;
       this.friendsName = friendsName;
   }

   @Override
   public String toString() {
       return "Cat{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", friendsName=" + friendsName +
               '}';
   }
}
Нужно написать метод, который будет «обнулять» объект этого класса, то есть присваивать null всем полям.
Примитивы обнулять не нужно.

public static void main(String[] args) {
   Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
   // Обнулить все поля
}
Подсказка. Лучше сделать универсальный метод, который может обнулить любой объект. Для самопроверки лучше создать
похожий класс, например Dog и попробовать его обнулить.
*/

package ru.stepup.courses.reflectionapi;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class ResetFields {
    public static void main(String[] args) throws IllegalAccessException {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println("До обнуления: " + cat);
        resetObject(cat);
        System.out.println("После обнуления: " + cat);

    }

    private static void resetObject(Cat cat) throws IllegalAccessException {
        Field[] fields = cat.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                field.set(cat, null);
            } catch (IllegalArgumentException e) {
                System.out.println("Примитивы не обнуляются!");
            }
        }
    }
}






