package com.campusdual.classroom;

import com.campusdual.Utils;
import jdk.jshell.execution.Util;

public class Exercise {

    public static int[] createAndInitializeArray(int size){
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
            return  array;
        }

        public static void showInlineArray(int[] array) {

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(" ");
                }
            }
        }


    public static void main(String[] args) {
    int n = Utils.integer("Introduce el tamaño del array (número de elementos): ");
    int[] myArray = createAndInitializeArray(n);
    showInlineArray(myArray);
    }
}
