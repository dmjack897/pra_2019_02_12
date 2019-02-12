package pra_2019_02_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("input.txt");//ファイルを読み込んでくれる部分
		try 
		{
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextInt()*100);  //ファイルの整数を読み込んで計算をする。
			}
			sc.close();
		} 
		//try部分にエラーがある場合実行
		catch (FileNotFoundException e) 
		{
			System.out.println("エラー発生");
		}

	}

}
