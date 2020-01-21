package bean;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class SockMerchant {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String numb=br.readLine();
		String[] array=numb.trim().split(" ");
		int count=0,temp;
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=Integer.parseInt(array[i]);
		}
		for(int i=0;i<n;i++) {
			temp=arr2[i];
			if(arr2[i]!=0) {
				for(int j=i+1;j<n;j++) {
					if(temp==arr2[j]) {
						arr2[i]=0;
						arr2[j]=0;
						count++;
						break;
					}
				}
			}
		}
		System.out.print(count);
		
		
	}

}
