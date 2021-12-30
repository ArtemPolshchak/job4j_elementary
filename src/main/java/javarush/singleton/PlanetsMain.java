package javarush.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Artem Polshchak on 25.12.2021.
 * @project JavaRush Закрепляем паттерн Singleton
 * Java Core
 * 5 уровень, 12 лекция
 * Для решения этой задачи тебе нужно:
 * Найти пример паттерна Singleton с ленивой реализацией (lazy initialization).
 * По образу и подобию в отдельных файлах создать в отдельных файлах три класса синглтона — Sun, Moon, Earth.
 * Реализовать интерфейс Planet в классах Sun, Moon, Earth.
 * В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
 * Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
 * для этого считай с консоли один параметр типа String.
 * если он равен одной из констант интерфейса Planet,
 * создай соответствующий объект и присвой его Planet thePlanet, иначе — обнули Planet thePlanet.
 */

public class PlanetsMain {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {

        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String planet  = reader.readLine();
        if (planet.equals(thePlanet.SUN)) {
            thePlanet = Sun.getInstance();
        } else if (planet.equals(thePlanet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (planet.equals(thePlanet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else {
            thePlanet = null;
        }
    }
}