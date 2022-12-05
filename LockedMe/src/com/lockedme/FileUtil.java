package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileUtil {
	
	//change the pathname accordingly
	String filePath = "C:\\Temp";
	File[] files;
	public FileUtil() {

	}

	//fetches all the files from the specified path
	public void fetchFiles() {
		File f = new File(filePath);
		files = f.listFiles();
	}

	//displays file names in ascending order
	public void displayFiles() {
		fetchFiles();
		if(files.length==0) {
			System.out.println("No file present in the specified path");
			return;
		}
		System.out.println("\nList of files:");
		Arrays.sort(files);
		int count =1;
		for(File f:files) {
			System.out.println(count+"\t"+f.getName());
			count++;
		}
	}

	//creates a new file in the directory
	public void addFile(String fileName) throws IOException {
		File f = new File(filePath+"\\"+fileName+".txt");
		boolean created = f.createNewFile();
		if(created)
			System.out.println("\nFile created successfully\n");
		else
			System.out.println("\nCould not create file\n");
	}

	//deletes the file specified
	public void deleteFile(String fileName) {
		fetchFiles();
		for(File file:files) {
			if(file.getName().equals(fileName)) {
				File f = new File(filePath+"\\"+file.getName());
				if(f.delete()) {
					System.out.println("\nFile deleted successfully\n");
					return;
				} 
			}
		}
		System.out.println("\nFile not found\n");
	}

	//searched for the specified file
	public void search(String fileName) {
		fetchFiles();
		for(File file:files) {
			if(file.getName().equals(fileName)) {
				System.out.println("\nFile exists\n");
				return;
			}
		}
		System.out.println("\nFile does not exist\n");
	}


}
