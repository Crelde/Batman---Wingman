package Opg1;

public class TrafficLight {

  private SignalColor signal;
  
  public void SetSignalColor(SignalColor s){
    signal = s;
  }
  
  public boolean DrivingAllowed(){
    return signal.drivingAllowed;
  }
  
  public String getColorOfLight(){
    return signal.toString();
  }
  
  public String toString(){
    if (DrivingAllowed()){
      return ("The light is " + getColorOfLight() + ". Driving is allowed!");
    }
    else{
      return ("The light is " + getColorOfLight() + ". Driving is not allowed!");
    }
  }
}
