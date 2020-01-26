package bean;

import java.io.*;

public class DesignerPDFViewer {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String numb=br.readLine();
		String[] arr=numb.trim().split(" ");
		int[] h=new int[26];
		int max=0;
		String word=br.readLine();
		for(int i=0;i<arr.length;i++) {
			h[i]=Integer.parseInt(arr[i]);
		}
		for(int i=0;i<word.length();i++) {
			int asc=word.charAt(i);
			int ind=asc-97;
			if(h[ind]>max) {
				max=h[ind];
			}
			
		}
		System.out.print(max*word.length());
	}

}
