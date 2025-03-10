package mytest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchAddress {

	public static void main(String[] args) throws Exception{
		
		String filePath = "c:/mytemp/post.txt";
		FileReader fr = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(fr);
		int number = 0;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("검색지역>>");
		String searchWord = scn.next();
		
		while(true) {
			String str = buffer.readLine();
			if(str == null) break;
			if(str.indexOf(searchWord) >-1) {
				number++;
				System.out.println(number+". "+str);
			}
		}

	}

}
