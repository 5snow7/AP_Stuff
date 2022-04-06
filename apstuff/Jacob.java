package apstuff;
//Jacob's version of AP_18_4
public class Jacob {
     
	Jacob(){
		}
	
static int[] getcol(int[][] ar, int c){
int[] result=new int[ar.length];
for(int j=0;j<ar.length;j++){
result[j]=ar[j][c];
}
return result;
}

static boolean hasallvalues(int[] arr1, int[] arr2){
for(int j=0;j<arr1.length;j++){
boolean check=false;
for(int k=0;k<arr2.length;k++){
if(arr1[j]==arr2[k]){
check=true;
break;
}
}
if(!check) return false;
}
return true;
}

static boolean dup(int[] arr){
for(int j=0;j<arr.length;j++){
for(int k=0;k<arr.length;k++){
if(arr[j]==arr[k]&&k!=j)return false;
}
}
return true;
}

static boolean islatin(int[][] ar){
if(!Jacob.dup(ar[0])) return false;
for(int j=1;j<ar.length;j++){
if(!(Jacob.hasallvalues(ar[0],ar[j])&&Jacob.hasallvalues(ar[0],Jacob.getcol(ar,j)))) {return false;}    
}
return true;
}

public static void main(String[] args) {
	int[][] ar1= {{2,3,3},{4,2,3},{3,4,2}};
	for(int j=0;j<ar1.length;j++) {
	System.out.print(Jacob.getcol(ar1,1)[j]+" ");
	}
	System.out.println("\n"+Jacob.islatin(ar1));
	System.out.println("\n"+Jacob.hasallvalues(ar1[0],ar1[1]));
        }
}


