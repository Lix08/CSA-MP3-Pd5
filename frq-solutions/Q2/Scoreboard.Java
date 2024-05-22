public class Scoreboard {
 private String team1;
 private String team2;
 private int s1;
 private int s2;
 private int  active ;
 public Scoreboard(String t1,String t2){
   team1=t1;
   team2=t2;
   s1=0;
   s2=0;
   active =1;
 }
  public String getScore(){
    String name="";
    if(active==1){
      name=team1;
    }
    else if(active ==2){
      name=team2;
    }
    return s1 + "-" + s2 + "-" +name;
  }
  public void recordPlay(int n){
    if(active ==1){
      if( n !=0 ){
        s1 +=n;
      }
      else{
        active =2;
      }
    } 
      else{
      if(n !=0){
        s2 +=n;
        
      }
        else{
          active=1;
        }
        
      }
    
  }

  
}
