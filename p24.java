class p24{
public static void main (String args[]){
for(int row=1;row<=5;row++) {
	System.out.print(row);
	for(int col=1;col<=row;col++) {
	System.out.print(" ");	
	}
	for(int col=2;col<=row;col++) {
	System.out.print(" ");	
	}
	for(int col=5;col>=row;col--) {
	System.out.print(row);
	}
	for(int col=5;col>=row;col--) {
	System.out.print(row);
	}
	System.out.println("");
}
}
}