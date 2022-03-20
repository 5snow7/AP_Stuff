package apstuff;

import java.util.ArrayList;

public class Ap_17_1 {
	  int num;
	  ArrayList<Integer> list;
	Ap_17_1(int num){
		this.num=num;
		list=new ArrayList<Integer>();
		while(num>1) {
			list.add(num%10);
			num=num/10;
		}
	}
		
		public void prtList() {
			for(Integer k:list) {
				System.out.print(k+", ");
		}
		
	}
		
		public boolean isIncr() {
			int total=list.size();int ch=0;
			while(ch<total-1) {
				if(list.get(ch)<list.get(ch+1)) {return false;}
				ch++;
			}
			return true;
		}
		
      public static void main(String[] args) {
    	  Ap_17_1 test=new Ap_17_1(34789);
    	  test.prtList();
    	  System.out.println(test.isIncr());
      }
}
