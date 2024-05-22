import java.util.*;

public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    String str="";
    int count=0;
    for(int i=0;i<wordList.size()-1;i++){
      str=wordList.get(i);
      if(wordList.get(i+1).indexOf(str)!= -1){
        count++;
      }
    }
    if(count ==wordList.size()-1){
      return true;
    }
    else{
      return false;
    }
  
  }


  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();
    for(String word : wordList){
      if(word.indexOf(target)==0){
        result.add(word.substring(target.length()));
      }
    }
    return result;             
  }
}
