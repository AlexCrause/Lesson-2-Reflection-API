package org.example.home_work;

import java.lang.reflect.Method;

/**
 * Используя Reflection API, напишите программу,
 * которая выводит на экран все методы класса String.
 */
public class HomeWork{
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}