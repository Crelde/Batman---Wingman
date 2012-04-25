package dk.itu.bosk.labs.f11.traade.printer;


public class JobProvider implements Runnable{
    PrintQueue queue;
    String user;

    public JobProvider (PrintQueue queue, String user){
	this.queue = queue;
	this.user = user;
    }

    public void run(){
	    PrintJob pj = new PrintJob("supJob");
    	while(true){
	    	if(queue.size() == 0){
	    		//so wronk
	    		queue.addJob(pj);
	    	}
	    }
    	
    	
    }


}
