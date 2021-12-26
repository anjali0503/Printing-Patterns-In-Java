/**

 11111
  22222
   33333
    44444
     55555

**/



class Pattern5{
	public static void main(String[]args){
		int i,j,k;
		for(i=1;i<=5;i++){
			for(k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=5;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}