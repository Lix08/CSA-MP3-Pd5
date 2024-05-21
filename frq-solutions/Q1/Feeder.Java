public class Feeder{
  private int currentFood;
  public Feeder(int c){
    currentFood=c;
  }
  public void simulateOneDay(int numBirds){
    if(Math.random() < 0.5){
      currentFood=0;
    }
    else{
      int eatfood=(int)(Math.random()*41)+10;
      int total=eatfood*numBirds;
      if(currentFood-total<0){
        currentFood =0;
      }
      else{
        currentFood-=total;
      }
    }
  }
  public int simulateManyDays(int numBirds, int numDays){
    int day=0;
    int count=0;
    while(currentFood>0 && day>numDays){
      count++;
      day++;
      simulateOneDay(numBirds);
    }
    return count;      
  }
}
