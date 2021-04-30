package com.parantheses;

public class ValidParantheses {
	public static boolean isValid(String s) {
        int len = s.length();
		StringBuilder sbr = new StringBuilder();
		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{')
			{
				sbr.append(ch);
				continue;
			}
			if (sbr.toString().isEmpty()) return false;
			if ((ch == ']' || ch == '}' || ch == ')')) {
				int lastIndex = sbr.length() - 1;
				char prevChar = sbr.charAt(lastIndex);
				if (ch == ')' && prevChar != '(') {
					return false;
				}else if(ch == '}' && prevChar != '{') {
					return false;
				}else if(ch == ']' && prevChar != '[') {
					return false;
				}
				sbr.deleteCharAt(lastIndex);
			}
		}		
		return sbr.toString().isEmpty();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "(([a+2])[(b)])";
		System.out.println(s1 + " is valid parantheses or not? " + isValid(s1));
		String s2 = "(3+)()(.";
		System.out.println(s2 + " is valid parantheses or not? " + isValid(s2));
		String s3 = "([)]";
		System.out.println(s3 + " is valid parantheses or not? " + isValid(s3));
		String s4 = "([{)";
		System.out.println(s4 + " is valid parantheses or not? " + isValid(s4));
	}

}
