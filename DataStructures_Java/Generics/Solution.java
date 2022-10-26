/*
 * ******************************************************************************************
 * Copyright©
 *
 * Este software foi desenvolvido por Vinicius Chiarotti nos desafios na plataforma HackerRank.
 *
 * Criado em: 25/10/2022
 * Autor: Vinicius Chiarotti
 * Contato: vchiarotti@outlook.com
 *
 * ------------------------------------------------------------------------------------------
 * Portfolio: https://drextar.github.io/Portfolio/
 * Github: https://github.com/drextar
 * Linkedin: https://www.linkedin.com/in/vchiarotti/
 * ------------------------------------------------------------------------------------------
 * ******************************************************************************************
 */

package Generics;

import java.lang.reflect.Method;

class Printer {
    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}

public class Solution {
    public static void main(String args[]) {
        Printer myPrinter    = new Printer();
        Integer[] intArray   = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name.equals("printArray")) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Method overloading is not allowed!");
        }
    }
}
