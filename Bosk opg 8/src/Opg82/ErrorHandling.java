package Opg82;

import Opg81.MyCheckedException;
public class ErrorHandling {

  public static void main(String[] args) {
    
    
    System.out.println("F�rste mulighed, grebet og h�ndteret");
    
    try{
      if (1+1!=3){
        throw new MyCheckedException("1+1 var ikke 3");
      }
    }
    catch(MyCheckedException e){
      System.out.println(e.getMsg());
    }

  }

  
  
}
