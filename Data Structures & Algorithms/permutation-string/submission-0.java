class Solution {

    public boolean equalarr(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (char x : s1.toCharArray()) {
            arr1[x - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            arr2[s2.charAt(right) - 'a']++;

            if (right - left + 1 > s1.length()) {
                arr2[s2.charAt(left) - 'a']--;
                left++;
            }

            if (equalarr(arr1, arr2)) {
                return true;
            }
        }

        return false;
    }
}