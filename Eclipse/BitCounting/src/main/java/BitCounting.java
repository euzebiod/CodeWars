/*
 * Write a function that takes an integer as input, and returns the number of bits that are equal 
 * to one in the binary representation of that number. You can guarantee that input is non-negative.
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
*/

public class BitCounting {

	public static void main(String[] args) {
	    System.out.println(BitCounting.countBits(1234)); 
	    System.out.println(BitCounting.countBits(4)); 
	    System.out.println(BitCounting.countBits(7)); 
	    System.out.println(BitCounting.countBits(9)); 
	    System.out.println(BitCounting.countBits(10)); 

	}

	public static int countBits(int n){
//		String strBin = Integer.toBinaryString(n).toString();
//		int nBits = 0;
//		
//		
//		for (int i = 0; i <  strBin.length(); i++ ) {
//			if(strBin.charAt(i) == '1') {
//				nBits++;
//			}
//		}
//
//		//System.out.println(n + " em binario " + strBin + " numero bits: " + nBits);
		return Integer.bitCount(n);
	}	

}
