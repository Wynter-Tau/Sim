public class Game {
  
    public Game() {}

    // utility function for checking if character is a lowercase letter from a to f
    public static boolean isValidLetter(char cha) {

        char[] letters = new char[6];

        boolean isLetter = false;

        for(int i = 0; i < 6; i++) {

            letters[i] = numToCha(i);

        }

        for(int i = 0; i < letters.length; i++) {

            if (cha == letters[i]) {

                isLetter = true;

            }

        }

        return isLetter;

    }

    // utility function for converting character to int, modified so 'a' is 0, 'b' is 1 etc.
    public static int charToInt(char cha) {

        int num = (int)(cha) - 97;

        return num;

    }

    // utility function for converting int to character, modified so 0 is 'a', 1 is 'b' etc.
    public static char intToCha(int num) {

        char cha = (char)(num + 97);

        return cha;

    }
    
}