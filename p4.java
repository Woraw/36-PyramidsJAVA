class p4{
public static void main (String args[]){
for(int row=1;row<=4;row++) {
	for(int col=1;col<=row;col++) {
	System.out.print("*");
	}
	for(int col=row;col>=2;col--){
	System.out.print(col);
	}
	for(int col=1;col<=row;col++){
	System.out.print(col);
	}
	System.out.println ("");
}
}
}