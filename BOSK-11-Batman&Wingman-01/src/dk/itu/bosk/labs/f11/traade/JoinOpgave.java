package dk.itu.bosk.labs.f11.traade;
/*
* SVAR TIL F�RSTE OPGAVE:
* I main metoden laver vi to tr�de som k�rer samtidig, den f�rste tr�d bliver dog sat til at sove i 2 sekunder.
* t2 bruger s� .join metoden, det vil sige at den venter p� t1 d�r, f�r den selv k�rer videre.
* S� for at svare p� sp�rgsm�let. f�rst skriver den n�r main starter, og n�r t1 og t2 bliver lavet.
* t2's print statement st�r dog efter de to run metoder, men tr�dede bliver f�rst sat igang ved .start() metoden.
* f�rst k�rer den s� t1's run metode og printer, "t1 started", lige bagefter k�rer den t2's run metode og printer "t2 started"
* s� skriver t1 ud n�r den er d�d, efter den har .sleep( 2000 ). bagefter dette skriver t2 sin finish print.
* og det kan den f�rst skrive n�r t1 er d�d, pga .join()
* bagefter slutter main s� og printer ud.
* 
* ^selvf�lgelig skrevet f�r vi �ndrede programmet i opg (b)
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
// Den f�rste Thread klasse
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
