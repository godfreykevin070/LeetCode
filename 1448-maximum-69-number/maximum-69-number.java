class Solution {
    public int maximum69Number (int num) {
        char[] strNum = String.valueOf(num).toCharArray();
        for (int i = 0; i < strNum.length; i++){
            if (strNum[i] == '6'){
                strNum[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(strNum));
    }
}