package Opg81;

public class MyCheckedException extends Exception {
  
  String msg;
  public MyCheckedException(){
    msg = "Something went wrong";
  }
  
  public MyCheckedException(String s) {
    msg = "This went wrong: " + s;
  }

  public String getMsg(){
    return msg;
  }
}
