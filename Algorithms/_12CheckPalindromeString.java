public class _12CheckPalindromeString {
    public static void main(String[] args) {
        _12CheckPalindromeString stringUtil = new _12CheckPalindromeString();
        if(stringUtil.isPalindrome("madam")){
            System.out.println("The string is palindrome! :)");
        } else{
            System.out.println("The string is NOT palindrome :(");
        }
        
    }
    public boolean isPalindrome(String word){

        char[] charArray = word.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while(left < right){

            if(charArray[left] != charArray[right]){
                return false;
            }

            left++;
            right--;

        }

        return true;
    }
    
}
