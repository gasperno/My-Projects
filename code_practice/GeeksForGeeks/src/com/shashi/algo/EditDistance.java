package com.shashi.algo;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "BOOK";
		String s2 = "BOOTASDAD";
		System.out.println(ED(s1.toCharArray(), s2.toCharArray(), 0, 0));
	}
	
	public static int ED(char s1[], char s2[], int i, int j)
	{
		if(i == s1.length)
			return s2.length - j;
		if(j == s2.length)
			return s2.length -i -1;
		if(s1[i] == s2[j])
			return ED(s1, s2, i+1, j + 1);
		else
			return 1 + Math.min(ED(s1, s2,i+1, j+1), Math.min(ED(s1,s2, i+1, j), ED(s1, s2, i, j+1)));
	}

}
