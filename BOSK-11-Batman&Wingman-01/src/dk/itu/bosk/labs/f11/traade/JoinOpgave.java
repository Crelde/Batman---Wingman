package dk.itu.bosk.labs.f11.traade;
/*
* SVAR TIL FØRSTE OPGAVE:
* I main metoden laver vi to tråde som kører samtidig, den første tråd bliver dog sat til at sove i 2 sekunder.
* t2 bruger så .join metoden, det vil sige at den venter på t1 dør, før den selv kører videre.
* Så for at svare på spørgsmålet. først skriver den når main starter, og når t1 og t2 bliver lavet.
* t2's print statement står dog efter de to run metoder, men trådede bliver først sat igang ved .start() metoden.
* først kører den så t1's run metode og printer, "t1 started", lige bagefter kører den t2's run metode og printer "t2 started"
* så skriver t1 ud når den er død, efter den har .sleep( 2000 ). bagefter dette skriver t2 sin finish print.
* og det kan den først skrive når t1 er død, pga .join()
* bagefter slutter main så og printer ud.
* 
* ^selvfølgelig skrevet før vi ændrede programmet i opg (b)
*/
public class JoinOpgave {
	

	public static void main( String[ ] args ){
		System.out.println("main started"); 
		Thread1 thread1 = new Thread1();
		Thread t1 = new Thread(thread1);
		System.out.println("t1 made");
		
		Thread2 thread2 = new Thread2(t1);
		Thread t2 = new Thread(thread2);
		System.out.println("t2 made");
		
		t1.start();
		System.out.println("t1 started");
		t2.start();
		System.out.println("t2 started");
		try{ 
			t2.join( ); 
		}
		catch( InterruptedException e ){ 
		}				
		System.out.println( "main finishes" );
	}
}
// Den første Thread klasse
class Thread1 implements Runnable{
	
	public void run(){
		try {
	
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();	
	}
		System.out.println( "t1 finishes" );	
	}
	}
// Den anden Thread klasse
class Thread2 implements Runnable{
	Thread t1;
	Thread2(Thread t){
	t1 = t;	
	}
	public void run(){
	
	try {
		t1.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		System.out.println( "t2 finishes" );				
	}
	}
