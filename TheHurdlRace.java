package bean;

import java.io.*;

public class TheHurdlRace {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line1=br.readLine();
		String[] line=line1.trim().split(" ");
		int n=Integer.parseInt(line[0]);
		int k=Integer.parseInt(line[1]);
		String line2=br.readLine();
		String[] array=line2.trim().split(" ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(array[i]);
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int diff=max-k;
		if(diff>0) {
			System.out.print(max-k);
		}else {
			System.out.println("0");
		}
		
	}

}
