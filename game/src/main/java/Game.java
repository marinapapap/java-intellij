public class Game {
    String wordToBlank;
    Game(String word) {
        wordToBlank = word;
    }
    public static void main(String[] args) {}

    public String getWordToGuess() {
        StringBuilder sb = new StringBuilder(wordToBlank);
        for(int i = 1; i < wordToBlank.length(); i++) {
            sb.replace(i, wordToBlank.length(), "_");
        }
        return sb.toString();
    }
}
