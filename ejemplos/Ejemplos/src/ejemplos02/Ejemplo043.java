/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo043 {

    public static void main(String[] args) {
        // 
        int[] valores1 = {10, 100, 1000, 20, 200, 2000};
        int[] valores2 = {1000, 1001, 1002, 1003, 1004};

        for (int i = 0; i < valores1.length; i++) {
            //
            int v1 = valores1[i];
            int v2 = valores2[i];

            obtenerSuma(v1, v2);
        }
        /*
        Lo que realizamos con este for es para enviar valores dependiendo 
        de las posciones al procedimiento, el cual realiza el proceso de ir 
        sumando los valores, para luego presentar un print de:
        El valor de la suma es: 1010
        El valor de la suma es: 1101
        El valor de la suma es: 2002
        El valor de la suma es: 1023
        El valor de la suma es: 1204
         */
    }

    public static void obtenerSuma(int a, int b) {
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);

    }

}
