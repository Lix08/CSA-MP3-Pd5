
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Feeder f=new Feeder(2400);
    f.simulateManyDay(10,4);
    System.out.prinln(f);

    Feeder g=new Feeder(250);
    g.simulateManyDay(10,5);
    System.out.prinln(g);

    Feeder q=new Feeder(0);
    q.simulateManyDay(5,10);
    System.out.prinln(q);
  }
}
