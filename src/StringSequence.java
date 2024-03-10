public class StringSequence {
    public static void main(String[] args) {
       System.out.println(characterSequence(new char[] {'7','a','4','b','0','c'}));
    }

    public static String characterSequence(char [] ch){
        String number="";
        String characters="";
        for(char c : ch){
            if(Character.isAlphabetic(c)){
                characters = characters+c;
            }
            if(Character.isDigit(c)){
                number = number + c;
            }
        }
        return number+characters;
    }
}
