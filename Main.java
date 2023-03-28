import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            String getAWordSomehow = "ughhhhhhhhhhhhhhhhhhhhhhhhhhh";
            char[] word = strToChar(getAWordSomehow);
            char[] guesses = new char[word.length];
            for (int i = 0; i<guesses.length; i++){guesses[i] = '_';}
            Scanner in = new Scanner(System.in);
            char guess = (in.nextLine()).charAt(0);
            in.close();
            //check if guess is in word
            for (int i = 0; i < word.length; i++){
                if (word[i] == guess){
                    guesses[i] = guess;
                }
            }
            if (getWord(guesses).equals(word)){
                break;
            }
            
        }
    }
    
    //conversion methods
    private static String getWord(char[] arr){
        String word = String.valueOf(arr[0]);
        for (int i = 1; i<arr.length; i++){
            word = word + arr[i];
        }
        return word;
    }
    private static char[] strToChar(String str){
        char[] array = new char[str.length()];
        for(int i = 0; i<str.length(); i++){
            array[i] = str.charAt(i);
        }
        return array;
    }

}
