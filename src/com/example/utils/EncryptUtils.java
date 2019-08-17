package com.example.utils;

public class EncryptUtils {
    public static String encryptText(String userInput, int shift) {
        userInput = userInput.toUpperCase();
        String newSign = "";

        for (int i = 0; i < userInput.length(); i++) {
            char sign = userInput.charAt(i);
            if (Character.isLetter(sign)) {
                sign = (char) (userInput.charAt(i) + shift);
                if (sign > 'z') {
                    newSign += (char) (userInput.charAt(i) - (26 - shift));
                } else {
                    newSign += (char) (userInput.charAt(i) + shift);
                }
            } else {
                newSign += (char) (userInput.charAt(i));
            }

        }
        return newSign.toUpperCase();
    }

    public static String decryptText(String encryptText, int shift) {
        encryptText = encryptText.toUpperCase();
        String oldSign = "";

        for (int i = 0; i < encryptText.length(); i++) {
            char sign = encryptText.charAt(i);
            if (Character.isLetter(sign)) {
                sign = (char) (encryptText.charAt(i) - shift);
                if (sign < 'z') {
                    oldSign += (char) (encryptText.charAt(i) + (26 + shift));
                } else {
                    oldSign += (char) (encryptText.charAt(i) - shift);
                }
            } else {
                oldSign += (char) (encryptText.charAt(i));
            }

        }
        return oldSign.toUpperCase();
    }
}
