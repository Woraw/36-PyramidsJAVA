class p2 {
public static void main (String args[]){
for(int row=1;row<=4;row++) {
	for(int col=row;col<=row+2;col++) {
		System.out.print(col);
	}
	
	for(int col=0;col<=1+row;col++){
		System.out.print("*");	
	}
	
	System.out.println("");
}
}
}