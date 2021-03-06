package LeetCode;

class MagicalString {
    public int magicalString(int n) {
        if (n < 1) return 0;
        if (n < 4) return 1;

        int[] magic = new int[n];
        magic[0] = 1;
        magic[1] = 2;
        magic[2] = 2;

        int result = 1;
        int next = 1;
        int countIndex = 2;
        int count = magic[countIndex];

        for (int i = 3; i < n;) {
            while (count > 0 && i < n) {
                if (next == 1) {
                    result++;
                }
                magic[i] = next;
                count--;
                i++;
            }
            next = next == 1 ? 2 : 1;
            countIndex++;
            count = magic[countIndex];
        }
        return result;
    }
}