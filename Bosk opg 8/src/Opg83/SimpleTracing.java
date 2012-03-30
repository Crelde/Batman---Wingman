package Opg83;

public class SimpleTracing {

    public static void main(String[] args) {
        String message = null;
        printInUpperCase(message);
    }

    public static void printInUpperCase(String stringToPrint) {
        String stringInUpperCase = convertToUpperCase(stringToPrint);
        System.out.println(stringInUpperCase);
    }

    public static String convertToUpperCase(String stringIn) {
        String stringOut = stringIn.toUpperCase(); 
        return stringOut;
    }
    
    
    
    /*
     * Svar p� sp�rgsm�l:
     * 
     * a) Det er en NullPointerException, som betyder at det objekt eller felt der refereres til er Null.
     * 
     * b) Som allerede beskrevet kort i a), kastes en NullPointerException n�r man pr�ver at udf�re ting/kald p� objekter eller felter
     * hvis v�rdi er null.
     * 
     * c) Fejlen opst�r i convertToUpperCase metoden, p� linje 16.
     * 
     * d) Tager man dem fra en ende af, er den f�rst linje en erkl�ring af at der er sket en fejl i "main" tr�den, 
     * og det er en java.lang.NullPointerException.
     * 
     * N�ste linje fort�ller os at det er i metoden convertToUpperCase p� linje 16, da det er der vi pr�ver at udf�re
     * et metodekald p� et objekt der indeholder Null.
     * 
     * Linjen efter fort�ller os at i convertToUpperCase metoden p� linje 11 blev kaldt i printInUpperCase metoden, og det var der den fik
     * sit null objekt fra.
     * 
     * Sidste linje fort�ller os at i main p� linje 7 bliver printInUpperCase metoden kaldt, med det objekt der skabte problemer.
     */
}
