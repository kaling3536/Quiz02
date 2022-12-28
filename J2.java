package test;

import java.io.*;

public class J2 {
		public static void main (String[] args) throws IOException
		   {
			FileWriter fw = new FileWriter("rand.txt");
			 BufferedWriter bfw = new BufferedWriter(fw);
		for (int i = 0; i < 10000; i++) {
			int r = 0;
			r = (int)(Math.random()*1000)+1;
			bfw.write((char)r);
	         bfw.newLine();
			System.out.println(r);
		}
		bfw.flush();
	      fw.close();
	   }
	}
