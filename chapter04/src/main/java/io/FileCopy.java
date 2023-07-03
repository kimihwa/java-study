package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("luffy.jpeg");
			os = new FileOutputStream("luffy.copy.jpeg");
			
			int data = -1;
			while((data = is.read()) != -1) {
				os.write(data);
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found" + e);
		} catch (IOException e) {
			System.out.println("Error:" + e);
		} finally {
			try {
				if(is != null) {
					is.close();
				}
				if(os != null) {
					os.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
