package com.exo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Flux2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("exemple2.dat");

		writeFlux(fos);
		fos.close();
	}

	private static void writeFlux(FileOutputStream fos) throws IOException {
		byte b = 4;
		long tp0 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			fos.write(b);
		}
		long tp1 = System.currentTimeMillis();
		System.out.println("temps d'éxecution "+(tp1-tp0));

	}

}
