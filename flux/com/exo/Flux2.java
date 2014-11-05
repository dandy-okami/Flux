package com.exo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Flux2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C://Users//admin//Desktop//exemple2.dat");
BufferedOutputStream bos = new BufferedOutputStream(fos);
		writeFlux(bos);
		bos.close();
	}

	private static void writeFlux(OutputStream fos) throws IOException {
		byte b = 4;
		long tp0 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			fos.write(b);
		}
		long tp1 = System.currentTimeMillis();
		System.out.println("temps pour écrire "+(tp1-tp0));

	}

}
