package caesarcipher;

/**
 *
 * @author LukasVyhnalek
 */
public class CaesarCipher {
    
    public static String encrypt(String msg, int key){
        String result = "";
        for(int i = 0; i< msg.length(); i++){
            char c = msg.charAt(i);
            if(Character.isLetter(c)){
                c += key;
                
                if(Character.isLowerCase(msg.charAt(i)) && c > 'z' ||
                        (Character.isUpperCase(msg.charAt(i)) && c > 'Z')){
                    c -= 26;
                }
            }
            
            result += c;
        }
        return result;
    }
    
    public static String decrypt(String msg, int key){
        String result = "";
        for(int i = 0; i< msg.length(); i++){
            char c = msg.charAt(i);
            if(Character.isLetter(c)){
                c -= key;
                
                if(Character.isLowerCase(msg.charAt(i)) && c < 'a' ||
                        (Character.isUpperCase(msg.charAt(i)) && c < 'A')){
                    c += 26;
                }
            }
            
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        String msg = "Hello World";
        int key = 4;
        System.out.println("Original Message: " + msg);
        String enMsg = encrypt(msg, key);
        System.out.println("Encrypted Message: " +enMsg);
        String orMsg = decrypt(enMsg, key);
        System.out.println("Decrypted Message: " +orMsg);
    }
    
}
