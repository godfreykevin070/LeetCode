class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int reverseNum = 0;

        if (num < 0) {
            return false;
        }

        while (num != 0) {
            int lastDigit = num % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            num = num / 10;
        }

        return x == reverseNum;
    }
}