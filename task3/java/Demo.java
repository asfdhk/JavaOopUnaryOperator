import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Demo implements UnaryOperator<List<String>> {
    @Override
    public List<String> apply(List<String> strings) {
        List<String> list = new ArrayList<>();
        for (String a:strings){
            if(a.length()>5){
                list.add(a);
            }
        }
        return list;
    }
}
