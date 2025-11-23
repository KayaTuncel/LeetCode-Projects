public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        String newStr = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                newStr += c;
            }
        }

        newStr = newStr.toLowerCase();

        int firstPointer = 0;
        int secondPointer = newStr.length() - 1;

        while (firstPointer < secondPointer) {
            if (newStr.charAt(firstPointer) != newStr.charAt(secondPointer)) {
                return false;
            }
            firstPointer++;
            secondPointer--;
        }

        return true;

    }

}
