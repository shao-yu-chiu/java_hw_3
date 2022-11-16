package java_hw_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p37 {
	public static void main(String[] args) throws IOException{
		System.out.println("請輸入英文字母");
		
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		String stru = str1.toUpperCase();
		String strl = str1.toLowerCase();
		
		System.out.println("轉換成大寫時為:" +stru);
		System.out.println("轉換成大寫時為:" +strl);
	}
}
