package apstuff;
//AP_19_4  ;  LightBd is class when refractored
//light is on is true.  

public class AP_19_4 {
             Boolean[][] lights;
               int row,col,intCol=0;
            AP_19_4(int row, int col){ 
            	this.row=row;this.col=col;
            	lights=new Boolean[this.row][this.col];
            	double prob;
            	for(int j=0;j<this.row;j++) {
            		for(int k=0;k<this.col;k++) {
            			prob=Math.random();
            			if(prob<.4) lights[j][k]=true;
            			else lights[j][k]=false;
            		}}}
            
            public boolean evaluateLight(int r, int c) {
            	int colTotal=0;
            	for(int cnt=0;cnt<lights.length;cnt++) {
            		if(lights[cnt][c]==true) {colTotal++;}
            	} 
            	if(lights[r][c]==true&&colTotal%2==0) {return false;}
            	else if(lights[r][c]== false&&colTotal%3==0) {return false;}
            	else return lights[r][c];
            	            }
            
            public void prtOrigLightBd() {
            	for(int j=0;j<this.row;j++) {
            		for(int k=0;k<this.col;k++) {
            			if(lights[j][k]==true) {
            				System.out.print("("+j+","+k+") is on;  ");
            			}else {System.out.print("("+j+","+k+") is off; ");}
            		} System.out.print("\n");
            }}
            
            public void prtLightBd() {
            	for(int j=0;j<this.row;j++) {
            		for(int k=0;k<this.col;k++) {
            			if(evaluateLight(j,k)==true) {
            				System.out.print("("+j+","+k+") is on;  ");
            			}else {System.out.print("("+j+","+k+") is off; ");}
            		} System.out.print("\n");
            }}
            
            
            public static void main(String[] args) {
            	AP_19_4 lb=new AP_19_4(7,6);
            	lb.prtOrigLightBd();
            	System.out.print("\n");
            	lb.prtLightBd();
            }
            
}
