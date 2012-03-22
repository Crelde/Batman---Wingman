package opg75;


import java.io.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("sup");
		Writer writerA = null;
		Writer writerB = null;
		File fil = new File("output.txt");
		try{
			writerA = new BufferedWriter(new OutputStreamWriter(System.out));
			writerB = new BufferedWriter(new FileWriter(fil));
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			} catch (IOException ex) {
			ex.printStackTrace();
			} 
			

		
		WriterFork fork = new WriterFork(writerA, writerB);
		char[] s = new char[3];
		s[0] = 'h';
		s[1] = 'e';
		s[2] = 'j';
		try{
			fork.write(s, 0, 3);	
		}
		catch(IOException e)
		{
			System.out.println("Failed to run fork.write()");
			e.printStackTrace();
		}
		finally {
			//Close the BufferedWriter
			try {
				if (writerB != null) {
					writerB.flush();
					writerB.close();
				}
				if	(writerA != null) {
					writerA.flush();
					writerA.close();
				}
			} 
			catch (IOException ex) {
			ex.printStackTrace();
			}
			}
	}
}
