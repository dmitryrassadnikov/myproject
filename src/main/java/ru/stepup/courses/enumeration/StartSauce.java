/*
#1.Создайте класс Соус, который описывается:

- Название: строка
- Острота: одно из {очень острый, острый, не острый}
- При создании требует указать название и остроту
- Может возвращать текстовое представление вида “Соус НАЗВАНИЕ: ОСТРОТА”
Гарантируйте, что острота соуса может указываться только одним из предопределенных значений.
*/

package ru.stepup.courses.enumeration;

public class StartSauce {
    public static void main(String[] args) {
        Sauce sauce = Sauce.valueOf("TABASCO");
        System.out.println(sauce);
    }

    enum Sauce implements Sauseble {
        TABASCO("очень острый"),
        CHILE("острый"),
        CURRY("не острый");

        private final String spiciness;

        Sauce(String spiciness) {
            this.spiciness = spiciness;
        }

        @Override
        public String toString() {
            return "Соус " + name() + ": " + spiciness;
        }
    }

    public interface Sauseble {
    }
}
