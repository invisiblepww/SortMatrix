package ArraySor;

public class MultiChange {

	private int[][] mas;

	void buildMass(int point){
		
	int n = (int)( Math.random()*9) + 5;
	mas = new int [n][n];
	
	for(int x = 0; x < mas.length; x++ ){
		for(int y = 0; y < mas[x].length; y++){
			mas[x][y] = (int)(Math.random()*8) + 1;
			}
		}
	if(point == 0){
		square();
	}
	else if(point == 1){
		evenOddX();
	}
	else if (point == 2){
		star();
	}
	
	for(int x = 0; x < mas.length; x++ ){
		for(int y = 0; y < mas[x].length; y++){
			System.out.print(mas[x][y] + " ");
			}
		System.out.println();
		}
	
	}
	void square(){
		for(int x = 0; x < mas.length; x++ ){
			for(int y = 0; y < mas[x].length; y++){
				if(x == 0 || y == 0 || x == mas.length - 1 || y == mas.length - 1){
					mas[x][y] = 0;
				}
			}
		}
		System.out.println("square");
	}
	void evenOddX(){
		int mod = mas.length % 2;
			if(mod == 0){
				for(int x = 0; x < mas.length; x++ ){
					for(int y = 0; y < mas[x].length; y++){
						if(x == y){
							mas[x][y] = 0;
							mas[mas.length - x -1][y] = 0;
						}
					}
				}
				System.out.println("evenX");
			}
			else{
				int center = ((mas.length - 1) / 2);
				int n = mas[center][center];
				System.out.println("oddX");
				System.out.println("center default " + n);
				for(int x = 0; x < mas.length; x++ ){
					for(int y = 0; y < mas[x].length; y++){
						if(x == y){
							mas[x][y] = 0;
							mas[mas.length - x -1][y] = 0;
						}
					}
				}
				mas[center][center] = n;
			}
	}
	void star(){
		int mod = mas.length % 2;
		if(mod == 1){
			System.out.println("star odd");
			int center = ((mas.length - 1) / 2);
			for(int x = 0; x < mas.length; x++ ){
				mas[center][x] = 0;
				for(int y = 0; y < center; y++){
					if(x == y){
						mas[mas.length - x - 1][mas.length - y - 1] = 0;
						mas[mas.length - x -1][y] = 0;
						mas[y][center] = 0;
					}
				}
			}
			
		}
		else{
			System.out.println("star even");
			System.out.println("to be...");
		}
	}
}









