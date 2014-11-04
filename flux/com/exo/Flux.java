package com.exo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;

public class Flux {
	static void writeFlux(OutputStream is) throws IOException {
		for (int cc = 33; cc < 127; cc++) {
			is.write(cc);
			if (cc % 30 == 0) {
				is.write('\n');

			}
			for (cc = 33; cc < 256; cc++) {
				byte[] arr = BigInteger.valueOf(cc).toByteArray();
				if (arr.length > 1) {

				}
				is.write(arr);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream(
				"C://Users//admin//Desktop//exemple.dat");
		writeFlux(fos);
		fos.close();
	}

}
