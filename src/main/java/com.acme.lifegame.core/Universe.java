package com.acme.lifegame.core;

class Universe{
	boolean[][] cells;
	Universe(int x, int y){
	}

	Universe(boolean c[][]){
		cells = c;
	}
	
	boolean isAlive(int x,int y){
		return(cells[x][y]);
	}

	int getLifeNeighbourNumber(int x,int y){
		int n=0;
		
		if(x> 0 && y>0 && isAlive(x-1,y-1)){
			n++;
		}
		if(y>0 && isAlive(x,y-1)){
			n++;
		}
		if(x<cells.length-1 && y>0 && isAlive(x+1,y-1)){
			n++;
		}
		if(x>0 && isAlive(x-1,y)){
			n++;
		}
		if(x< cells.length-1 && isAlive(x+1,y)){
			n++;
		}
		if(x>0 && y<cells[0].length-1 && isAlive(x-1,y+1)){
			n++;
		}
		if(y<cells[0].length-1 && isAlive(x,y+1)){
			n++;
		}
		if(x< cells.length-1 && y<cells[0].length-1 && isAlive(x+1,y+1)){
			n++;
		}				
		return(n);
	}

	void tick(){
		int[][] n= new int[cells.length][cells[0].length];

		for(int i=0;i< cells.length; i++){
			for(int j=0; j< cells[0].length; j++){
				n[i][j]=getLifeNeighbourNumber(i,j);
			}
		}		
		for(int i=0;i< cells.length; i++){
			for(int j=0; j< cells[0].length; j++){
				if (cells[i][j]){
					if(n[i][j]< 2){
						cells[i][j] = false;
					}
					if(n[i][j] >= 2 && n[i][j] <= 3 ) {
						cells[i][j]=true;
					}
					if(n[i][j] > 3 ){
						cells[i][j]=false;
					}
					
				}else{
					if(n[i][j]==3){
						cells[i][j]=true;
					} 
				}
			}
		}
	}
} 
