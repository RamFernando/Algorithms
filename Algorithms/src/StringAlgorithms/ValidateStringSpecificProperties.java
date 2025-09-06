package StringAlgorithms;

public class ValidateStringSpecificProperties {

    public static boolean isPasswordComplex(String s){
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println(isPasswordComplex("helL0"));
        System.out.println(isPasswordComplex("HEllo"));
        System.out.println(isPasswordComplex("heLLo"));
        System.out.println(isPasswordComplex("HELLO"));
        System.out.println(isPasswordComplex("hello"));
    }
}
