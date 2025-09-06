package StringAlgorithms;

public class CustomParsing {

    public static boolean isAtEvenIndex(String s, char c){
        if(s == null || s.isEmpty()){
            return false;
        }

        for (int i = 0; i < s.length()/2 + 1; i=i+2) {
            if (s.charAt(i) == c){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "heLLo";
        System.out.println(isAtEvenIndex(s,'h'));
        System.out.println(isAtEvenIndex(s,'e'));
        System.out.println(isAtEvenIndex(s,'L'));
        System.out.println(isAtEvenIndex(s,'o'));
    }
}
