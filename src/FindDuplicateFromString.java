import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicateFromString {
    public static void main(String[] args) {
        String str = "jitesh katkar";
      Map<Character,Integer>  map = findDuplicateFromString(str);
      map.entrySet().stream().forEach(m ->
      {
        if(m.getValue() > 1){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
      } );
     Set s =  map.entrySet().stream().filter(m -> m.getValue() > 1).;

    }
 public static Map<Character,Integer>  findDuplicateFromString(String str){
           Map<Character,Integer> map = new HashMap<>();
            for(char c : str.toCharArray()){
                if (map.containsKey(c)) {
                    map.put(c, map.get(c)+1);
                }else {
                    map.put(c,1);
                }
            }
            return map;
    }  
}
