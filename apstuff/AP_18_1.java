package apstuff;

public class AP_18_1 {
	int goalDistance;
	int maxHops;
	
	AP_18_1(int goalDistance,int maxHops){
		this.goalDistance=goalDistance;
		this.maxHops=maxHops;
		
	}
	
	int hopDistance() {
		return (int)(-6+(Math.random()*20));
	}
	
	boolean simulate() {
		System.out.println("GoalDistance is "+goalDistance+" and max hops is "+maxHops);
		int thisTime=(int)((Math.random()*maxHops)+2);
		int totalSoFar=0;
		int numOfHops=0;
		while((numOfHops<maxHops&&numOfHops<thisTime)&&totalSoFar<goalDistance) {
			int jump=hopDistance();
			totalSoFar+=jump;
			numOfHops++;
			System.out.print("(J"+numOfHops+" w/ "+jump+"), ");
		}
		if(totalSoFar>=goalDistance) {System.out.println(" made with "+totalSoFar); return true;}
		else {System.out.println(" failed with "+totalSoFar); return false;}
	}
	
	double runSimulations(int num){
		double simFail=0,simSuc=0;
	    int counter=0;
	    while(counter<num) {
		boolean cntB=simulate();
		if(cntB==true) {simSuc++;}
		else {simFail++;}
		counter++;
	    }
	    return simSuc/(simSuc+simFail);	
	}
	
	public static void main(String[] args) {
		AP_18_1 sim=new AP_18_1(20,6);
		System.out.println(" \nthe ratio of success to total is "+sim.runSimulations(40));
		
	}

}
