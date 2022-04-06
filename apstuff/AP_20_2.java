package apstuff;

public class AP_20_2 {
      int sector;
      int numOfRuns;
      int currentRun;
      
      AP_20_2(int sector){
    	  this.sector=sector;
    	numOfRuns=1;
    	currentRun=(int)(Math.random()*sector+1);
      }
      
      public int spin() {
    	  int rand=(int)(Math.random()*sector+1);
    	 if(rand==currentRun) {numOfRuns++;}
    	 else {numOfRuns=1;currentRun=rand;}
    	  return rand;
      }
      
      public int currentRun() {
          	  return numOfRuns;
    	  }
      
      public static void main(String args[]) {
            AP_20_2 spin1=new AP_20_2(5);
            for(int j=0;j<12;j++) {
            	System.out.println("spin is "+spin1.spin()+"  and run number is "+spin1.currentRun());  
            }
      }
     
}
