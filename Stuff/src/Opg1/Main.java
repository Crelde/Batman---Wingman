package Opg1;

public class Main {


  public static void main(String[] args) {
    TrafficLight t = new TrafficLight();
    t.SetSignalColor(SignalColor.RED);
    System.out.println(t.toString());
    t.SetSignalColor(SignalColor.YELLOW);
    System.out.println(t.toString());
    t.SetSignalColor(SignalColor.GREEN);
    System.out.println(t.toString());
  }

}
