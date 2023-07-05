import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sdfasd","123456","dsf","ds","sgfdgfsf");
        Demo demo = new Demo();
        List<String> result = demo.apply(list);
        System.out.println(result);
    }
}
