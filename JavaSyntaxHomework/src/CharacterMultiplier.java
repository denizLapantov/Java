import java.util.Scanner;

/**
 * Created by deniz on 23.3.2016 г..
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstString = console.next();
        String secondString = console.next();
        int finalResult = Multiplier(firstString, secondString);
        System.out.println(finalResult);

    }
    public static int Multiplier(String str1 , String str2){
        int result = 0;

        if (str1.length() > str2.length()) {
            for (int i = 0; i <str1.length() ; i++) {
                try {
                    result +=str1.charAt(i) * str2.charAt(i);
                } catch (StringIndexOutOfBoundsException ex){
                    result += str1.charAt(i);
                }
            }
       }else{
            for (int i = 0; i < str2.length(); i++) {
                try {
                    result += str2.charAt(i) * str1.charAt(i);
                } catch (StringIndexOutOfBoundsException ex){
                    result += str2.charAt(i);
                }
            }
        }
        return result;
    }
}
