

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_ScalableBox {

	public static void main(String[] args) {
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}
	
	public static void drawBoxCap() {
		int scale = 10;
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= scale; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		int scale = 10;
		for( int insideRowIndex = 1; insideRowIndex <= scale; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		int scale = 10;
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= scale; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
