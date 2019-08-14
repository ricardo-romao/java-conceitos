package br.com.ciandt.thiagodf;

/**
 * Classe de VariaveisPrimitivas.
 * 
 * @author thiagodf
 *
 */
public class VariaveisPrimitivas {
	
	/**
	 * Método que declara as variaveis
	 * Depois da um print
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		byte myByte = (byte)1;
		short myShort = (short)10;
		int myInt = 100;
		long myLong = 1000;
		float myFloat = 100.1234567890f;
		double myDouble = 100.1234567890123456789d;
		char myCharNumber = 97;
		char myCharText = 'a';
		boolean myBoolean = true;
		
		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myInt);
		System.out.println(myLong);
		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println(myCharNumber);/* retorna char => a  ao inves de char => 97 */
		System.out.println(myCharText);
		System.out.println(myBoolean);
		
	}
	
}
