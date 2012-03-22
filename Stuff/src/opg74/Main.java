package opg74;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		// Constructs a new FileInfo objec
		FileInfo file = new FileInfo("C:" + File.separator + "FileTestX");
		System.out.println("Answer to question (a): ");
		System.out.println(file.getFile().getPath() + " contains " + file.getFileCount() + " files ");
		System.out.println("");
		System.out.println("Answer to question (b): ");
		System.out.println(file.getFile().getPath() + " contains " + file.getFileCount() + " files with a total size of " + file.getFileSize() + " bytes ");
		System.out.println("");
		
		// Constructs a new FileInfo object with the constructor including a search string
		FileInfo file2 = new FileInfo("C:" + File.separator + "FileTestX", ".class");
		System.out.println("Answer to question (c): ");
		System.out.println(file2.getFile().getPath() + "  these files were found: " + file2.search() + " total files found: " + file2.getSearchResults() );
		
	}
}
