class p22{
public static void main (String args[]){
for(int row=1;row<=5;row++) {
	System.out.print("*");
	for(int col=2;col<=row;col++) {
	System.out.print(" ");	
	}
	for(int col=0;col<=5-row;col++){
	System.out.print(row);
	}
	for(int col=0;col<=4-row;col++){
	System.out.print(row);
	}
	for(int col=2;col<=row;col++) {
	System.out.print(" ");	
	}
	System.out.print("*");
	System.out.println("");
}
}
}