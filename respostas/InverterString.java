package org.example;

public class InverterString {

    public static void main(String[] args) {

        String abc = "AbCdEfGhIjKlMnOpQrStUvWxYz";
        abc = inverte(abc);
        System.out.println(abc);
    }

    static String inverte(String str) {
        char[] arr = str.toCharArray();
        char aux;
        for (int i = 0, j = arr.length - 1 ; i < j; i++, j--) {
            aux = arr[i];
            arr[i] = arr[j];
            arr[j] = aux;
        }
        return new String(arr);
    }
}
