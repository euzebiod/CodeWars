package br.codewar;

import java.util.ArrayList;
import java.util.List;

/*
Description:
Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.

This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.

What is considered Valid?
A string of braces is considered valid if all braces are matched with the correct brace.

Examples
"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False
 */

public class BraceChecker {
	public boolean isValid(String braces) {

		if(braces.length() == 0) {
			return true;
		}
		
		List<Character> pilha = new ArrayList<Character>();
		
		if (braces.charAt(0) == ')' || braces.charAt(0) == '}' || braces.charAt(0) == '}') {
			return false;
		}
		
		for (int i = 0; i < braces.length(); i++) {
			char brace = braces.charAt(i);

			if (brace == '(' || brace == '{' || brace == '[') {
				pilha.add(brace);
			} else {
				int nTopo = pilha.size() - 1;
				if(nTopo < 0 ) {
					return false;
				}
				
				char topo = pilha.get(nTopo);

				if ((topo == '(' && brace == ')') || (topo == '{' && brace == '}') || (topo == '[' && brace == ']')) {
					pilha.remove(nTopo);
				} else {
					return false;
				}

			}
		}

		return pilha.size() == 0;
	}
}
