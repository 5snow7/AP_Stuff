package apstuff;

//this is AP_20_1 or the Coll class-ie the 3*x+1 problem.

public class AP_20_1 {
    int ask;
    AP_20_1(int ask){
    	this.ask=ask;
    }
      
    void firstDigit() {
    	int check=this.ask;
    	while(check>10) {
    		check=check/10;
    	}
    	System.out.println("first integer of "+this.ask+" is "+check);
    }
    
    void Cal() {
    	int result=this.ask;int cnt=0;
    	while(result>1) {
    	System.out.print(result+" ");
    	if(result%2==0) {result=result/2;}
    	else {result=3*result+1;}
    	cnt++;
    	if(cnt%21==20) {System.out.println(" ");}
    	}
    	System.out.println("1");
    	//System.out.print("last integer in cycle is "+result);
    	//System.out.println(" ");
    	System.out.println("total # of cycles is "+(cnt+1));
    	
    }
    //good numbers 43,459,147
	public static void main(String[] args) {
		for(int j=127;j<250;j=j+1) {
			AP_20_1 cal=new AP_20_1(j);
		    cal.Cal();
		    cal.firstDigit();
		    System.out.println(" ");
		}   		

	}

}

