package Opg1;

public enum SignalColor {
  RED{
    public boolean drivingAllowed=false;}, 
    YELLOW, GREEN;

  public boolean drivingAllowed;
  
  SignalColor(){
    drivingAllowed=true;
  } 
}

