package ioservice;

import java.io.File;
import java.util.Calendar;

public class FileInfo1 {

	public static void main(String[] args) {
		//파일이름, 생성날짜, 파일종류, 파일크기
		String filepath = "c:/mytemp/test1.txt";
		File file = new File(filepath);
		
		System.out.println("파일이름 : "+file.getName());		//파일명 -  test1.txt
		System.out.println("파일크기 : "+file.length()+"byte");		//크기(바이트) 10
		System.out.println("존재여부 : "+((file.exists())?"존재":"미존재"));		//존재여부 true
		System.out.println("파일경로 : "+file.getPath());		//파일경로 c:\mytemp\test1.txt
		System.out.println("파일여부 : "+((file.isFile())?"파일":"파일아님"));		//파일인지에 대한 여부 true
		System.out.println("폴더여부 : "+((file.isDirectory())?"파일":"폴더아님"));	//폴더인지에 대한 여부 false
//		System.out.println(file.lastModified());//마지막 수정 날짜 1740462613863
		long unix = file.lastModified();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(unix);
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		int dd = cal.get(Calendar.DATE);
		
		System.out.println("생성날짜 : " + yy+"-"+mm+"-"+dd);
		System.out.println("------------------");
		
//		try {
//			file.createNewFile();
//		}catch(Exception e){
//			
//		}
		
//		file.createNewFile();	//(빈)파일생성 try 해줘야함
//		file.delete();	//파일삭제
//		file.listFiles();	//파일목록정보
		
		File file1 = new File("c:/mytemp/java");
		file1.mkdir();	//폴더생성
		
	}

}
