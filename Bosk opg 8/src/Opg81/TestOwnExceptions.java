package Opg81;

import Opg81.MyCheckedException; 

public class TestOwnExceptions { 

  public static void main(String[] args) {

    System.out.println("Kalder throwMyCheckedException");
    try{
      throwMyCheckedException();
    }
    catch(MyCheckedException e){
      System.out.println(e.getMsg());
    }
    
    // N�r min unchecked exception bliver fanget af en try-catch blok, ignorerer programmet den helt, som havde den ikke eksisteret, og kan sagtens forts�tte.
    System.out.println("Kalder throwMyUncheckedException med try-catch blok");
    try{
      throwMyUncheckedException();   
    }
    catch(MyUncheckedException e){
    }
    // N�r den bliver bliver kastet uden en try-catch blok, stopper programmet, da det den extender runtimeException
    System.out.println("Kalder throwMyUncheckedException uden try-catch blok");
    throwMyUncheckedException();
  }
  public static void throwMyCheckedException() throws MyCheckedException {
    throw new MyCheckedException("Kunne ikke t�lle til 10");
  }

  public static void throwMyUncheckedException() throws MyUncheckedException {
    throw new MyUncheckedException();

  }
}
