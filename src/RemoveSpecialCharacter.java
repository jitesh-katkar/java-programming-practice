import java.util.stream.Collectors;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {

     System.out.println(removeSpecialCharacterFromString("abc@abct#tyu^kai"));
    }

    public static String removeSpecialCharacterFromString(String str) {
        return str.chars().filter(s -> Character.isLetterOrDigit(s))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
