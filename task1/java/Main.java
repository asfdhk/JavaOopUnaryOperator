import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(2,99,56,4,3,6,8,9));
        UnaryOperator<Integer> una = (a)->{
          if (a%2 !=0){
              return 0;
          }else {
              return a;
          }
        };
        System.out.println(numbers);
        numbers.replaceAll(una);
        System.out.println(numbers);
    }
}
