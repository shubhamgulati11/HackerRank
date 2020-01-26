package bean;


import java.util.*;

public class ViralAdvertising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int days=in.nextInt();
		int shared=5,liked=0,cumulative=0;
		for(int i=0;i<days;i++) {
			if(i==0) {
				shared=5;
			}
			liked=shared/2;
			cumulative=liked+cumulative;
			shared=liked*3;
//			System.out.println("shared:"+shared+" liked:"+liked);
			
		}
		System.out.print(cumulative);
	}

}
