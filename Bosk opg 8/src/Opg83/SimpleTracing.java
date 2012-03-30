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
     * Svar på spørgsmål:
     * 
     * a) Det er en NullPointerException, som betyder at det objekt eller felt der refereres til er Null.
     * 
     * b) Som allerede beskrevet kort i a), kastes en NullPointerException når man prøver at udføre ting/kald på objekter eller felter
     * hvis værdi er null.
     * 
     * c) Fejlen opstår i convertToUpperCase metoden, på linje 16.
     * 
     * d) Tager man dem fra en ende af, er den først linje en erklæring af at der er sket en fejl i "main" tråden, 
     * og det er en java.lang.NullPointerException.
     * 
     * Næste linje fortæller os at det er i metoden convertToUpperCase på linje 16, da det er der vi prøver at udføre
     * et metodekald på et objekt der indeholder Null.
     * 
     * Linjen efter fortæller os at i convertToUpperCase metoden på linje 11 blev kaldt i printInUpperCase metoden, og det var der den fik
     * sit null objekt fra.
     * 
     * Sidste linje fortæller os at i main på linje 7 bliver printInUpperCase metoden kaldt, med det objekt der skabte problemer.
     */
}
