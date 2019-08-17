package com.example.main;

import com.example.utils.EncryptUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj słowo");
        String word = input.nextLine();
        System.out.println("Podaj przesunięcie");
        int shift = input.nextInt();
        System.out.println("Szyfrowanie:");
        String encrypt = EncryptUtils.encryptText(word, shift);
        System.out.println(encrypt);
        System.out.println("Rozszyfrowanie:");
        String decrypt = EncryptUtils.decryptText(encrypt, shift);
        System.out.println(decrypt);
    }
}