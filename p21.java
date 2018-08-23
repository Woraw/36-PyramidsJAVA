class p21{
public static void main (String args[]){
for(int row=1;row<=5;row++) {
	for(int col=row;col<=7;col++){
	System.out.print(" ");
	}
	System.out.print(row);
	for(int col=1;col<=row;col++){
	System.out.print(" ");
	}
	for(int col=row;col<=row;col++){
	System.out.print(8-row);
	}
	System.out.println("");
}
}
}