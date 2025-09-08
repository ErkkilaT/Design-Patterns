import java.sql.SQLOutput;
import java.util.*;

public class GuessTheWordGame extends Game{
    private int numberOfPlayers;
    private int currentPlayer;
    private static Scanner scanner = new Scanner(System.in);

    private String correctWord;
    private Map<Integer, String> guessMap = new HashMap<>();


    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
    public boolean endOfGame() {
        return currentPlayer == numberOfPlayers-1;
    }
    public void playSingleTurn(int player) {
        currentPlayer = player;
        if(player == 0){
            System.out.println("Player 0 give the correct word: ");
            correctWord = scanner.nextLine();
            System.out.println("Player 0 give a clue to your word:");
            String clue = scanner.nextLine();
            System.out.println("\n\n\n\n\n");
            System.out.println("The clue is: " + clue);
        }
        else{
            System.out.println("Player " + player + " guess the word:");
            String word = scanner.nextLine();
            guessMap.put(player, word);
        }

    }
    public void displayWinner() {
        System.out.println("\nThe correct word was: " + correctWord);
        List<Integer> correct = guessMap.entrySet()
                .stream().filter(entry -> entry.getValue().equals(correctWord))
                .map(Map.Entry::getKey).toList();
        if(correct.isEmpty() ){
            System.out.println("Oh no! No one guessed the correct word");
        }
        else if(correct.size() > 1){
            System.out.println("Multiple winners:");
            for(int player : correct){
                System.out.println("Player " + player + " guessed the correct word!");
            }
        }
        else{
            System.out.println("Player " + correct.get(0) + " won!");
        }
    }
}
