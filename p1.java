class p1 {
public static void main (String args[]){
for(int row=1;row<=4;row++) {
	for(int col=2; col<=0+row; col++) {
	System.out.print(" ");
	}
	for(int col=row; col<=row+1; col++) {
	System.out.print(row);
	}
	for(int col=1; col<=4-row; col++){
	System.out.print("**");
	}
	for(int col=row; col<=row+1; col++) {
	System.out.print(row);
	}
	System.out.println("");
	}
}
}