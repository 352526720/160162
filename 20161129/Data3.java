// Data3.java
//  ファイルに、データを書く。
//  type result.txt

import java.io.*;

public class Data3 {
	public static void main (String[] args) {
		try{
			// 1. ファイルを準備する。
			File f            = new File("result.txt");
			FileWriter fw     = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw    = new PrintWriter(bw);

			// 2. ファイルに書く。
			pw.println("ALOHA!");

			// 3. ファイルをとじる。
			pw.close();

		} catch (IOException e) {
			System.out.println("エラーです。");
			e.printStackTrace();
		}
	}
}