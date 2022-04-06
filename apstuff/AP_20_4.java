package apstuff;
//2020 #4  Seat  ie theater Seats

public class AP_20_4{
	
	 boolean available;
	 int tier;
	
	 public AP_20_4(boolean isAvail, int tierNum) {
		available=isAvail;tier=tierNum;
		}
	 
	
	public boolean isAvailable() {
		if(available) {return true;}//false means ticket has been sold.
		else {return false;}
		}
	
	public int getTier() {
	   return tier;
	}
	
	public void seatAvailability(boolean isAvail) {
	   if(isAvail) {available=true;}
	   else {available=false;}
	}
	
	public void prt(int r,int c) {
	  System.out.print("("+available+",tier "+tier+" row "+r+" col "+c+"),");	
	} 
	
	public static void main(String args[]) {
		Theater theater=new Theater(5,3,2);
		theater.prt();
		}
}

 class Theater{

private AP_20_4[][] theaterSeats;
 int seatsPerRow; int tier1Rows; int tier2Rows;
            int tier1=1,tier2=2;
public Theater(int seatsPR, int tier1, int tier2) {
          seatsPerRow=seatsPR;tier1Rows=tier1;tier2Rows=tier2;
          
	theaterSeats=new AP_20_4[tier1Rows+tier2Rows][seatsPerRow];
          for(int j=0;j<(tier1Rows+tier2Rows);j++) {
        	  for(int k=0;k<seatsPerRow;k++) {
        		  if(j<tier1Rows) {theaterSeats[j][k]=new AP_20_4(true,tier1);}
        		  else {theaterSeats[j][k]=new AP_20_4(true,tier2);}
        	  }
          }
	}

public void prt() {
	 for(int j=0;j<(tier1Rows+tier2Rows);j++) {
   	  for(int k=0;k<seatsPerRow;k++) {
   		  if(k<tier1Rows) {theaterSeats[j][k].prt(j,k);}
   		  else {theaterSeats[j][k].prt(j, k);}
   	  }System.out.println("\n");
     }
	}

public boolean reassignSeat(int fromRow, int fromCol,int toRow, int toCol) {
             
             if(theaterSeats[toRow][toCol].isAvailable()&&theaterSeats[fromRow][fromCol].getTier()==tier1Rows) {theaterSeats[toRow][toCol]=new AP_20_4(false,theaterSeats[fromRow][fromCol].getTier());theaterSeats[fromRow][fromCol].seatAvailability(true);return true;}
             if(theaterSeats[toRow][toCol].isAvailable()&&theaterSeats[fromRow][fromCol].getTier()==tier2Rows&&theaterSeats[toRow][toCol].getTier()==tier2Rows) {theaterSeats[toRow][toCol]=new AP_20_4(false,theaterSeats[fromRow][fromCol].getTier());theaterSeats[fromRow][fromCol].seatAvailability(true);return true;}             
             return false;
     }
}