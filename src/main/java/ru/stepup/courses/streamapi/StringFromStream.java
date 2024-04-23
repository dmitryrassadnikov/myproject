/*
#1.Задача состоит в том, чтобы метод getStringFromStream(Stream<String>) превращал входящий поток строк стримов в строку,
слова в которой нужно разделить пробелом. Порядок слов в строке должен быть равен порядку слов в потоке.

Подсказка: Для реализации можно использовать метод collect() у  Stream<String>. В качестве параметра нужно передать
коллектор (объект типа Collector<String>). Коллектор можно получить, вызвав метод joining() у класса Collectors.

public static String getStringFromStream(Stream stringStream) {
        //напишите тут ваш код
        return "";
}
*/

package ru.stepup.courses.streamapi;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StringFromStream {

    public static void main(String[] args) {
        System.out.println(getStringFromStream(Stream.of("Hard", "to", "learn,", "easy", "to", "fight!")));
    }

    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }
}


