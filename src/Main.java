public class Main {
    public static void main(String[] args) {
        String ransomNote = "hello world";
        String magazine = "hello";

        LeetCode383 leetCode383 = new LeetCode383();
        boolean bool = leetCode383.canConstruct(ransomNote, magazine);
        System.out.println(bool);
    }
}
