/*
  	ISYS 320
  	Name(s):
  	Date: 
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| HEADING		| HEADING		| HEADING		| HEADING		| HEADING		|	

1 				| !! | !! | !! | !! | !! | !! | !! | !! | !! | !! | !!
2 				| // | !! | !! | !! | !! | !! | !! | !! | !! | !! | //
3 				| // | // | !! | !! | !! | !! | !! | !! | !! | // | //
4 				| // | // | // | !! | !! | !! | !! | !! | // | // | //
5 				| // | // | // | // | !! | !! | !! | // | // | // | //
6 				| // | // | // | // | // | !! | // | // | // | // | //



*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 first I need to created a loop that writes a line of code and then proceeds to the next line.
 then I need to created an inner loop that creates eleven pairs of symbols
 All the symbols must be printed out based on what line are they on.
 
 
 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {
		for (int line = 1; line <= 6; line++){
			int slashes = line - 1;
			int exclamationMark = 11 - (slashes * 2);
			
			for (int leftSlash = 1; leftSlash <= slashes; leftSlash++ ){
				System.out.print("//");
			}
			for (int centerExclaimationMark = exclamationMark; centerExclaimationMark >= 1; centerExclaimationMark--){
				System.out.print("!!");
			}
			
			for (int rightSlash = 1; rightSlash <= slashes; rightSlash++ )
			{
				System.out.print("//");
			}
			
			System.out.println("");
		}
	}

}
