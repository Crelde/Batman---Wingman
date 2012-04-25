package dk.itu.bosk.labs.f11.traade.printer;

public class PrintJob {
    String text;

    public PrintJob(String string) {
	text = string;
    }

    public String toString(){
	return text;
    }

}
