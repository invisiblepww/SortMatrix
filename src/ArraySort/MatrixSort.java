package ArraySort;


public class MatrixSort {
	int[][] m;
	int lengthM;
	int number;
	
	int ranNumber(boolean b){
		if(b){
			lengthM = 5;
			number = (int)(Math.random()*10);
			lengthM += number;
		}
		else{
			number = (int)(Math.random()*99);	
		}
		return number;
	}
	void buildM(){
		number = ranNumber(true);
		m = new int[lengthM][lengthM];
		
		for(int x = 0; x < m.length; x++){
			for(int y = 0; y < m[x].length; y++){
				number = ranNumber(false);
				m[x][y] = number;
			}
		}
	}
	void xNull(){
		int mod = m.length % 2;
		int xL = m.length - 1;
		//System.out.println(mod + " %");
		if(mod == 1){
			int center = ((m.length - 1) / 2);
			int Number = m[center][center];
			//System.out.println(getNumber + " Center number");
			for(int x = 0; x < m.length; x++){
				for(int y = 0; y < m[x].length; y++){
					if(x == y){
						m[x][y] = 0;
						m[xL - x][y] = 0;
					}
				}
			}
			m[center][center] = Number;
		}
		else{
			for(int x = 0; x < m.length; x++){
				for(int y = 0; y < m[x].length; y++){
					if(x == y){
						m[x][y] = 0;
						m[xL - x][y] = 0;
					}
				}
			}
		}
	}
	void PrintMatrix(){
		for(int x = 0; x < m.length; x++){
			for(int y = 0; y < m[x].length; y++){
				if(m[x][y] < 10){
					System.out.print(" ");
				}
				System.out.print(m[x][y] + " ");
			}
			System.out.println();
		}
	}
}
