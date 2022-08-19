import java.util.ArrayList;
import java.util.List;

/*
 * ! 这个写的比较逆天
 */
public class LeetCode412 {
    public boolean isThree(int n) {
        return n % 3 == 0;
    }

    public boolean isFive(int n) {
        return n % 5 == 0;
    }

    public List<String> fizzBuzz(int n) {
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (isThree(i)) {
                if (isFive(i)) {
                    strings.add("FizzBuzz");
                } else {
                    strings.add("Fizz");
                }
            } else {
                if (isFive(i)) {
                    strings.add("Buzz");
                } else {
                    strings.add(Integer.toString(i));
                }
            }
        }
        return strings;
    }
}
