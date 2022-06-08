package ch4.p123;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++) {
			if((i%2)==0 && i!=0) {
				for(int idx=0; idx<10; idx++) {
					System.out.println(i+"x"+idx+" = "+mul.multi(i));
					//continue;					
				}
				System.out.println();
			}	
		}
	}//end of main
}
