public class ReverseString {
    public static void main(String[] args) {
        System.out.println( reverseString("jitesh katkar"));
    }
  public static String  reverseString(String str){
       String reverseString =  new StringBuffer(str).reverse().toString();
        //System.out.println(reverseString);
       return reverseString;
    }
}
