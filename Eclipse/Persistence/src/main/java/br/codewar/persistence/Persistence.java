package br.codewar.persistence;

public class Persistence {

	public static int persistence(long n) {
		String inLong = Long.toString(n);
	
		int pers = 0;
		
		while (inLong.length() > 1) {

			int resutado = 1;
			
			for (int i = 0; i < inLong.length(); i++) {
				resutado *= Integer.parseInt(String.valueOf(inLong.charAt(i)));
			}
			inLong = Integer.toString(resutado);
			pers++;
		}
		return pers;
	}
}
