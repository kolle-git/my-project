import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class PrintCommonElementsFrom2List{
    public static void main (String[] args){
        List<Integer> list1  = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2  = Arrays.asList(4, 5, 6, 7, 8, 9);
        List<Integer> commonElements = 
        Stream.concat(list1.stream(), list2.stream())
              .distinct()
              .collect(Collectors.toList());
        System.out.println(commonElements);//[1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}