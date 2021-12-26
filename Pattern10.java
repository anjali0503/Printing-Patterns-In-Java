/**
write a program to print following pattern

output--->


*
**
***
****
*****
******
*****
****
***
**
*


**/





class Pattern10{
	public static void main(String[]args){
		int i,j;
		for(i=1;i<=6;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=5;i++){
			for(j=1;j<=5-i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}