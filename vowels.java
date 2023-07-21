import java.util.Scanner;
class vowels
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int wordCount = 0;
        int vowelCount = 0;

        
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            int wordVowelCount = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = Character.toLowerCase(word.charAt(i));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    wordVowelCount++;
                    vowelCount++;
                }
            }
            System.out.println("Word: " + word + ", Vowel Count: " + wordVowelCount);
            wordCount++;
        }

        System.out.println("Total Word Count: " + wordCount);
        System.out.println("Total Vowel Count: " + vowelCount);
    }
}