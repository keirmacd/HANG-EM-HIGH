public class Player{
  private int numlives = 6;

  public boolean isDead(){
    if (numlives <= 0){
      return true;
      }else {
        return false;
      }
    }
    public void loseLife(){
      numlives--;
    }
public int getNumlives(){
  return numlives; 
  }
}
