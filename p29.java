class p29{
public static void main (String args[]){
for(int row=1;row<=5;row++) {
	System.out.print(row);
	System.out.print(" ");
	System.out.print(2+row);
	for(int col=1;col<=2+row;col++) {
	System.out.print("*");
	}
	System.out.println("");
}
}
}