class p32{
public static void main (String args[]){
for(int row=1;row<=5;row++) {
	for(int col=1;col<=8-row;col++) {
	System.out.print(col);	
	}
	for(int col=1;col<=2+row;col++) {
	System.out.print(" ");	
	}
	System.out.print(row+2);
	System.out.println("");
}
}
}