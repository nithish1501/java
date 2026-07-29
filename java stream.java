import java.util.*;
import java.util.stream.*;

public class StreamDemo{
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(10,20,30,40,50);

        list.stream()
            .filter(n->n>20)
            .forEach(System.out::println);
    }
}