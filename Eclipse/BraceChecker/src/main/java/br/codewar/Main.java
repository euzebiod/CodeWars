package br.codewar;

public class Main {

	public static void main(String[] args) {
		BraceChecker checker = new BraceChecker();
		System.out.println(checker.isValid("(){}[]" ));
		System.out.println(checker.isValid("([{}])"));
		System.out.println(checker.isValid( "(}" ));
		System.out.println(checker.isValid("[(])" ));
		System.out.println(checker.isValid( "[({})](]"));
		System.out.println(checker.isValid( ")"));
		System.out.println(checker.isValid( ""));		
		System.out.println(checker.isValid( "())({}}{()][]["));	
	}

}
