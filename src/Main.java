import java.util.List;

public class Main {
    public static void main(String[] args) {
        LeetCode412 leetCode412 = new LeetCode412();
        List<String> strings = leetCode412.fizzBuzz(20);

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
