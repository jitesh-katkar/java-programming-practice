public class EvenOrOddWithoutModulus {
    public static void main(String[] args) {

        System.out.println(isEvenOrOdd(0));

    }

    public static boolean isEvenOrOdd(int number){
        if(number > 1)
            return (number / 2) * 2 == number;
        else
            return false;
    }
}
