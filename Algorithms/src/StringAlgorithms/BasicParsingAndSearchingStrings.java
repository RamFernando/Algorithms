package StringAlgorithms;

public class BasicParsingAndSearchingStrings {

    public static void parseContents(String s){
        System.out.println("Option 1");
        for (char c: s.toCharArray()){
            System.out.print(c);
        }

        System.out.println();
        System.out.println("Option 2");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        String s = "heLLo";
        System.out.println(s.contains("LL"));

        parseContents(s);
    }
}
