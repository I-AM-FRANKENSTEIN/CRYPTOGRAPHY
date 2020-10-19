/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xorcipher;

/**
 *
 * @author LukasVyhnalek
 */
public class XorCipher {

    public static String encrypt(String msg, String key) {
        String result = "";
        for (int i = 0; i < msg.length(); i++) {
            char c = (char) (key.charAt(i % key.length()) ^ msg.charAt(i));
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        String msg = "Hello World";
        String psw = "1234";
        System.out.println("Original Message: " + msg);
        String enMsg = encrypt(msg, psw);
        System.out.println("Encrypted Message: " + enMsg);
        String orMsg = encrypt(enMsg, psw);
        System.out.println("Decrypted Message: " + orMsg);
    }

}
