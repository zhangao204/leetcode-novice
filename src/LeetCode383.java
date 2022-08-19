public class LeetCode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] sc = new int[26];

        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        for (char s : magazine.toCharArray()) {
            sc[s - 'a']++;
        }

        for (char s: ransomNote.toCharArray()){
            int result = s - 'a';
            sc[s - 'a']--;
            if (sc[s - 'a']<0){
                return false;
            }
        }

        return true;
    }
}
