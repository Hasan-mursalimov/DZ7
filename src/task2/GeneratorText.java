package task2;

import java.awt.*;
import java.util.Random;

public class GeneratorText {
    public String generatoText(int wortLenght) {
        Random random = new Random();
        //Создаем пустом обьект класса StringBuilder , и передаем значение конструктора
        StringBuilder sb = new StringBuilder(wortLenght);
        //задаем длину слова
        wortLenght = random.nextInt(6) + 3;
        //цикл for для обхода букв
        for (int i = 0; i < wortLenght; i++) {
            //создаем случайные слова от а до z
            char tmp = (char) ('a' + random.nextInt('z' - 'a'));
            //добавляем в строку
            sb.append(tmp);
        }
        return sb.toString();
    }
}
