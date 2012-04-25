package dk.itu.bosk.labs.f11.traade.printer;


public class JobProviderBatch implements Runnable {
    PrintQueue queue;
    String user;

    public JobProviderBatch (PrintQueue queue, String user){
	this.queue = queue;
	this.user = user;
    }

    public void run(){
	// TODO
    }

}
