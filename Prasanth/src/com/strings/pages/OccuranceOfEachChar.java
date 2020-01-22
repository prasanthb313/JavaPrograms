package com.strings.pages;

public class OccuranceOfEachChar {
public static void main(String[] args) {
	String str="abcda";
	char [] array=str.toCharArray();
	for(int i=0;i<array.length;i++)
	{
		int count=0;
		char ch=array[i];
		for(int k=0;k<array.length;k++)
		{
			char ch2=array[k];
			if(i>k&&ch==ch2)
				break;
			if(ch==ch2)
				count++;
			if(k==array.length-1)
				System.out.println(ch+"  occured number of times is  "+count);
		}
	}
	System.out.println();
}
}


