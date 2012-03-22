package Opg3;

public class Main {


  public static void main(String[] args) {
    sendStatus(StatusCode.HTTP404);
    sendStatus(StatusCode.HTTP205);
    sendStatus(StatusCode.HTTP505);
  }
  public static void sendStatus(StatusCode s){
    System.out.println(s.getDescription());
  }
}
