package apstuff;

//AP_17_2 Practice Problems
	public class AP_17_2{
             int base,start,inc;		
		AP_17_2(int base, int start){
          this.base=base;this.start=start;
          inc=0;
		}
		
		public void nextPr() {
			start=start+1;
		}
	    
		public String getPr() {
			return base+" times "+start;		}
		
	public static void main(String[] args) {
		AP_17_2 test1=new AP_17_2(5,8);
		for(int j=0;j<5;j++) {
		test1.nextPr();
		System.out.println(test1.getPr());
	}}
	
	
	}
	
	
	


