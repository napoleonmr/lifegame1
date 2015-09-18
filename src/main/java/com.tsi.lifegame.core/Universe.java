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
} 
