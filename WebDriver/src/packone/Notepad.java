package packone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Notepad {

	public static void main(String[] args) throws Exception{
		
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\WD9\\output.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("This is Kishore");
		bw.newLine();
		bw.write("This is Selenium");
		bw.close();
		
		
		
		/*FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\WD9\\0605.txt");
		BufferedReader b=new BufferedReader(f);
		System.out.println(b.read());
		String s;		
		while((s=b.readLine())!=null){
			String[] c=s.split(" ");
			System.out.println(c[2]);
		}*/

	}

}
