package bean;

import java.io.*;
import java.util.*;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int tcase=in.nextInt();
		while(tcase-->0) {
			int n=in.nextInt();
			int h=1;
			for(int i=0;i<n;i++) {
				if(n==0) {
					break;
				}
				if(i%2==0) {
					h=h*2;

				}else if(i%2!=0) {
					
					h=h+1;

				}
			}
			System.out.println(h);
		}
		
	}

}
