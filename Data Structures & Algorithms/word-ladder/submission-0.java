

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);

        if (!set.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int k = 0; k < size; k++) {
                String curr = queue.poll();

                if (curr.equals(endWord)) {
                    return level;
                }

                char[] arr = curr.toCharArray();

                for (int i = 0; i < arr.length; i++) {
                    char original = arr[i];

                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == original) continue;

                        arr[i] = ch;
                        String nextword = new String(arr);

                        if (set.contains(nextword)) {
                            queue.offer(nextword);
                            set.remove(nextword);
                        }
                    }

                    arr[i] = original;
                }
            }

            level++;
        }

        return 0;
    }
}