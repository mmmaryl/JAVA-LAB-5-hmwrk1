import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner scanner = new Scanner (System.in);
    System.out.println ("Please type the word to check: ");
    String word = scanner.nextLine();

    word = word.toLowerCase();

    boolean checkPalindrome = true;

    for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
            checkPalindrome = false;
            break;
        }
    }

    if (checkPalindrome) {
        System.out.println ("Congrats! The word " + word + " is a palindrome!");

    }
    else {
        System.out.println ("Hmm... The word " + word + " is NOT a palindrome :(");
    }


}
