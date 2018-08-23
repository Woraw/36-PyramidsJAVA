class p19{
public static void main (String args[]){
for(int row=1;row<=5;row++) {
	for(int col=row;col<=row;col++) {
	System.out.print(col);	
	}
	for(int col=row;col<=9;col++){
	System.out.print("*");
	}
	for(int col=2;col<=row;col++){
	System.out.print(" ");
	}
	for(int col=row;col<=row;col++){
	System.out.print(6-row);
	}
	System.out.println("");
}
}
}