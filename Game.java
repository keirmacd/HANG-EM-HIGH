import java.util.ArrayList;

public class Game{
 private Player player1;
 private boolean isWon = false;
 private Word word;
 private ArrayList<Character>guesses;

 public Game(Word word, Player player1){
  this.player1 = player1;
  this.word = word;
  this.guesses = new ArrayList<Character>();

}

public boolean getIsWon(){
  return isWon;
}
public void setIsWon(boolean isWon){
  this.isWon = isWon;
}
public void addGuess(Character c){
  c = Character.toLowerCase(c);
  if(!guesses.contains(c)){
    guesses.add(c);

  }
}
public ArrayList<Character> getGuesses(){
  return guesses;
}
public String update(){
  String output ="";
  //check if letter is in word
  Character lastGuess= guesses.get(guesses.size() - 1);
  if(!word.getWord().contains(lastGuess.toString().toLowerCase())){
    player1.loseLife();

  }
  //pass guesses to our word; compare
  output = this.word.update(guesses);
  output = output + "\n";
  output = output + "You have " + player1.getNumlives() +" lives remaining. ";

// check if the game is won
  if (word.getWord().equals(word.getHiddenWord() )){
    isWon = true;
  }
  return output;

}
}