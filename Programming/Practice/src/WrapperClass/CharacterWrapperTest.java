package WrapperClass;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CharacterWrapperTest{
    public static void main(String[] args) throws IOException {
        Character characterValue = 'M';
        char ch = '9';
        System.out.println(Character.isLetter(characterValue));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.toLowerCase(characterValue));
        System.out.println("Enter a character");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Character character = (char) br.read();
        System.out.println("Is it digit?: "+Character.isDigit(character));
        System.out.println("Is it Letter?: "+Character.isLetter(character));
        System.out.println("Is it whitespace?: "+Character.isWhitespace(character));
        System.out.println("Is it space?: "+Character.isSpaceChar(character));
        System.out.println("Is it upper case?: "+Character.isUpperCase(character));
        System.out.println("Is it lower case?: "+Character.isLowerCase(character));
        System.out.println("Is it letter or digit?: "+Character.isLetterOrDigit(character));
        Character characterConvert = Character.valueOf(character);
        System.out.println(characterConvert);
        System.out.println("To lower case: "+Character.toLowerCase(characterConvert));
        System.out.println("To upper case: "+Character.toUpperCase(characterConvert));
        System.out.println("Equals"+characterConvert.equals(ch));
        System.out.println("Comparision"+characterConvert.compareTo(' '));
        String str = character.toString();
        System.out.println(str);
        Character charv = Character.valueOf(ch);
    }
}
