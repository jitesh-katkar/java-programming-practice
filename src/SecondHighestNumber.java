import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
        // Second highest number from list

        List<Integer> numberList = Arrays.asList(44, 71, 64, 96, 86);
        int num = numberList.stream().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(num);

    }
}
