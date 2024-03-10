import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Remove duplicates from Integer List using java 8 
public class RemoveDuplicates {
    public static void main(String[] args) {
       System.out.println(removeDuplicates(Arrays.asList(12,45,12,45,25,1,2,6,3)));
       System.out.println("USsing java 8 from array " + removeDuplicatesFromArrayOfInteger(new int[] {12,23,12,25,25,88,54}));
       System.out.println(removeDuplicatesFromListOfString(Arrays.asList("abc","xyz","abc","add","sub")));
    }

    public static List<Integer> removeDuplicates(List<Integer> list){
        return list.stream().distinct().toList();

    }

    
    public static List<Integer> removeDuplicatesFromArrayOfInteger(int[] list){
    
       return Arrays.stream(list).boxed().distinct().toList();
       
    }

    public static List<String> removeDuplicatesFromListOfString(List<String> list){
    
        return list.stream().distinct().toList();
        
     }
    
}
