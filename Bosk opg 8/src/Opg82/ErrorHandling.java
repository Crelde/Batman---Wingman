package Opg82;

import Opg81.MyCheckedException;
import Opg81.MyUncheckedException;
import java.util.ArrayList;
public class ErrorHandling {

  public static void main(String[] args) {
    
    
    System.out.println("Første mulighed, grebet og håndteret");
    
    try{     
        throw new MyCheckedException();    
    }
    catch(MyCheckedException e){
      System.out.println(e.getMsg());
      
    }

    System.out.println("Anden mulighed, grebet og smidt en ny af anden type");
    try{
        //Dette vil kaste en IllegalArgumentException da start kapaciteten for en ArrayList ikke kan være negativ.
        ArrayList list = new ArrayList<String>(-1);
    }
    catch(IllegalArgumentException e){
      try{
        throw new MyUncheckedException();
      }
      catch(MyUncheckedException ex){
        
      }
    }
    
    System.out.println("Tredje mulighed, Viderkast fejl.");
    //Fejlen kastet af DangerousMethod bliver kastet videre til DangerousMethod2, som så kaster den til main hvor vi kalder den.
    try{
      DangerousMethod2();
    }
    catch(MyCheckedException e){
      
    }
    
    System.out.println("Fjerde mulighed, ignorer.");
    
    throw new MyUncheckedException();
  }

  public static void DangerousMethod() throws MyCheckedException{
    throw new MyCheckedException();
  }
  
  public static void DangerousMethod2() throws MyCheckedException{
    DangerousMethod();
  }
}
