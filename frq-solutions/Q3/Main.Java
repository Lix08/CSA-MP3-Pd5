import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println("2024 FRQ Q3");

    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("an");
    list1.add("band");
    list1.add("band");
    list1.add("abandon");
    System.out.println(list1);
    ArrayList<String> list2 = new ArrayList<String>();
    list2.add("to");
    list2.add("too");
    list2.add("stool");
    list2.add("tools");
    System.out.println(list2);
    WordChecker test1 = new WordChecker(list1);
    WordChecker test2 = new WordChecker(list2);


    // PART A TESTS
     System.out.println(test1.isWordChain()); // expected result: true
     System.out.println(test2.isWordChain()); // expected result: false

    ArrayList<String> list3 = new ArrayList<String>();
    list3.add("catch");
    list3.add("bobcat");
    list3.add("catchacat");
    list3.add("cat");
    list3.add("at");
    System.out.println(list3);

    WordChecker test3 = new WordChecker(list3);
  
 



    // PART B TESTS
     System.out.println(test3.createList("cat")); // ["ch", "chacat", ""]
     System.out.println(test3.createList("catch")); // ["", "acat"]
     System.out.println(test3.createList("dog")); // []
    
    
  }
}
