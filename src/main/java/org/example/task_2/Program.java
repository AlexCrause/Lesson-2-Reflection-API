package org.example.task_2;

import java.lang.reflect.Field;

/**
 *
 Задача 2: Применение Reflection API в разработке
 <p>

 Реализуйте обобщенный метод, который принимает объект и выводит в консоль значения всех его полей.
 Создайте класс "Car" с различными полями (например, модель, цвет, год выпуска).
 Примените Reflection API для вывода значений полей созданного объекта класса "Саr"
 с использованием ранее созданного метода.
 */
public class Program {

    public static void main(String[] args) throws IllegalAccessException {
        Car car = new Car("BMW", "Red", 2019);
        task2(car);
    }

    private static <T> void task2(T object) throws IllegalAccessException {
        Class<?> objClass = object.getClass();

        Field[] fields = objClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.printf("%s = %s\n", field.getName(), field.get(object));
        }
    }
}
