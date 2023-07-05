import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        String text = "dfas98";
        UnaryOperator<String> una =(a)->{
            String number = "";
            for (char i : a.toCharArray()){
                if (Character.isDigit(i)){
                    number +=i;
                }
            }
            return number;
        };
        System.out.println(una.apply(text));
    }
}
