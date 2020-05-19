package br.com.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.

I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.

For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99. Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?

Example:
"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes: "100 180 90 56 65 74 68 86 99"

When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers: 100 is before 180 because its "weight" (1) is less than the one of 180 (9) and 180 is before 90 since, having the same "weight" (9), it comes before as a string.

All numbers in the list are positive numbers and the list can be empty.

Notes
it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers
Don't modify the input
For C: The result is freed.

#ALGORITHMS #NUMBERS
*/
public class WeightSort {
	
	static WeightSort weightSort = new WeightSort();

	public class Weight implements Comparable<Weight> {
		String weight;

		public Weight(String weight) {
			this.weight = weight;
		}

		public int compareTo(Weight otherWeight) {
			int retorno = 0;

			if (this.getgetWeightToLong() < otherWeight.getgetWeightToLong()) {
				retorno = -1;
			} else {
				if (this.getgetWeightToLong() > otherWeight.getgetWeightToLong()) {
					retorno = 1;
				} else {
					if (this.weight.compareTo(otherWeight.getWeight()) < 0) {
						retorno = -1;
					} else {
						retorno = 1;
					}
				}
			}

			return retorno;
		}

		public String getWeight() {
			return this.weight;
		}

		public long getgetWeightToLong() {
			long sum = 0;

			for (int i = 0; i < weight.length(); i++) {
				sum += Integer.parseInt(String.valueOf(weight.charAt(i)));
			}

			return sum;
		}

	}

	public static String orderWeight(String strng) {
		String retorno = "";
		String[] textoSeparado = strng.split(" ");
		List<Weight> Weights = new ArrayList<Weight>();

		for (String splitStr : textoSeparado) {
			Weights.add(weightSort.new Weight(splitStr));
		}

		Collections.sort(Weights); 
		
		for (int i=0; i < Weights.size() ; i++) {
			retorno += Weights.get(i).getWeight();
			if(i <  Weights.size() - 1 ) {
				retorno +=  " ";
			}
		}
		
		return retorno;
	}
}
