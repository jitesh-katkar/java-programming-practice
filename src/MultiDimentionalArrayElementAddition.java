public class MultiDimentionalArrayElementAddition {
    public static void main(String[] args) {
       int result =  additionOfMultiDimentionalArray(new int[][]{{1,2,3},{4,5},{9,8,7}} );
       System.out.println(result);
    }

    public static int additionOfMultiDimentionalArray(int[][] arr) {
        int result = 0;
        for (int[] i : arr) {
            for (int n : i) {
                result = result + n;
            }
        }
        return result;
    }
}
