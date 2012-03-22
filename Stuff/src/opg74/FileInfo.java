package opg74;

import java.io.File;
import java.util.ArrayList;

public class FileInfo {
	
	private int fileCount = 0;
	private long fileSize = 0;
	private File file;
	private File[] files;
	private String searchPhrase = null;
	private int searchResult = 0;
	// Constructor giving a path
	public FileInfo(String path){
		String filePath = path;
		file = new File(filePath);
		files = file.listFiles();
	}
	// Constructor for searching in a given path
	public FileInfo(String path, String searchPhrase){
		String filePath = path;
		file = new File(filePath);
		files = file.listFiles();
		this.searchPhrase = searchPhrase;
		
	}
	
	public File getFile(){
		return file;
	}
	// Checks if the objects in the path is directories or files and counts if they are files
	public int getFileCount(){

		for(File f: files){
			if (f.isFile()) {
				fileCount++;
				}
		}
		return fileCount;
	}
	// Checks if the objects are files and then adds up their size
	public long getFileSize(){
		for(File f: files){
			if (f.isFile()) {
				fileSize+=f.length();
			}
		}
		return fileSize;
	}
	// Searches the file array if they match the searchstring and returns an arraylist of the results
	public ArrayList<String> search(){
		String fString = null;
		ArrayList<String> stringList = new ArrayList<String>();
		
		for(File f: files){
			fString = f.toString();
			if (fString.contains(searchPhrase)){
				stringList.add(fString);
				searchResult++;
			}
		}
		System.out.println("search... " + searchResult);
		return stringList;
	}
	
	public int getSearchResults(){
		System.out.println("getSearch.." + searchResult);
		return searchResult;
	
	}
	
}
