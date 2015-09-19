package com.tsi.lifegame.core;

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
		return(8);
	}

	void tick(){
		int n=0;
		for(int i=0;i< cells.length; i++){
			for(int j=0; j< cells[0].length; j++){
				getLifeNeighbourNumber(i,j);
				if (n < 2) {
					cells[i][j] = false;
				}
			}
		}
	}
} 
