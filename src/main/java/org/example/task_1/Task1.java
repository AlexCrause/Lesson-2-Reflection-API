package org.example.task_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 Задача 1: Основы Reflection API
 <p>
 ===
 Получите информацию о класce "Person" с использованием Reflection API:
 выведите на экран все поля и методы класса.
 Создайте экземпляр класса "Person" с использованием Reflection API,
 установите значения полей и вызовите методы.
 Реализуйте обработку исключений для обеспечения корректного взаимодействия c Reflection API.
 */
public class Task1 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException,
            InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {

        Class<?> personalClass = Class.forName("org.example.task_1.Person");

        // вывод всех полей класса
        Field[] fields = personalClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Поле: " + field.getName());
        }

        // получить список всех конструкторов класса
        Constructor<?>[] constructors = personalClass.getConstructors();

        // создадим экземпляр класса
        Object personInstance = constructors[0].newInstance(null);

        Field nameField = personalClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(personInstance, "Иван");

        Field ageField = personalClass.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(personInstance, 30);

        Method displayInfo = personalClass.getDeclaredMethod("displayInfo");
        displayInfo.invoke(personInstance);
    }
}