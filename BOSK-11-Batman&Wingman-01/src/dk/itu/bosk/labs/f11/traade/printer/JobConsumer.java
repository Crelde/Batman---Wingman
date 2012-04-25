package dk.itu.bosk.labs.f11.traade.printer;


public class JobConsumer implements Runnable {

    PrintQueue queue;

    public JobConsumer(PrintQueue queue) {
	this.queue = queue;
    }

    public void run() {
    	while(true) {
    		if (queue.size() != 0){
    			queue.removeJob();
    			System.out.println("Removed a job");
    		}
    		else {
    			try {
					this.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
    		}
    	}
    }
}
