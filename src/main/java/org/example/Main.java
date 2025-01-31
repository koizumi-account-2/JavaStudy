package org.example;

public class Main {
    public static void main(String[] args) {
        /** byteについて**/
        byte byteVal = 100;
        // byteVal = 150; エラー

        /** shortについて**/
        short shortVal = 32000;
        // shortVal = 40000; エラー

        /** intについて**/
        int intVal = 123456789;
        intVal = 012; // ８進数
        intVal = 0xA; // １６進数
        // intVal = 9223372036854775807; エラー

        /** longについて**/
        long longVal = 9223372036854775807L;

        /** floatについて**/
        float floatVal = 3.14f;

        /** doubleについて**/
        double doubleVal = 3.1415;

        /** charについて**/
        char letter = 'あ';
        letter = 213;
        char unicodeChar = '\u3042'; // あ　と同じ

        /** booleanについて**/
        boolean flg = true;

    }
}