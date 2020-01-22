package com.strings.pages;

public class ReverseString {
public static void main(String[] args) {
	String str="A Code That Cannot Be Tested Is Flawed";
	String [] array=str.split(" ");
	for(int i=0;i<array.length;i++)
	{
		String test=array[i];
		for(int k=test.length()-1;k>=0;k--)
		{
			char ch=test.charAt(k);
			if(k==0)
				System.out.print(Character.toLowerCase(ch));
			else
				System.out.print(Character.toUpperCase(ch));
		}
		System.out.print(" ");
	}
}
}

