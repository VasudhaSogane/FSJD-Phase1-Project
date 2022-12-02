package com.lockedme;

import java.io.IOException;
import java.util.Scanner;

public class lockedMe {
	public static void main(String[] args) throws IOException {
		FileUtil util = new FileUtil();
		int ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Add File");
			System.out.println("2.Delete File");
			System.out.println("3.Display File");
			System.out.println("4.Search File");
			System.out.println("5.Exit");
			System.out.println("Enter the choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				String fileName;
				System.out.println("Enter the file name");
				fileName=sc.next();
				util.addFile(fileName);
				break;

			case 2:
				String fileName1;
				System.out.println("Enter the file name");
				fileName1=sc.next();
				util.deleteFile(fileName1);
				break;

			case 3:
				util.displayFiles();
				break;

			case 4:
				String fileName2;
				System.out.println("Enter the file name");
				fileName2=sc.next();
				util.search(fileName2);
				break;

			case 5:
				sc.close();
				System.exit(0);
				break;

			}
		}while(ch<6);
	}
}
