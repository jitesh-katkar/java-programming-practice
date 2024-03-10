public class EvenOrOddWithoutModulus {
    public static void main(String[] args) {

        System.out.println(isEvenOrOdd(23));

    }

    public static boolean isEvenOrOdd(int number){
        if(number > 0)
            return (number / 2) * 2 == number;
        else
            return false;
    }
}
