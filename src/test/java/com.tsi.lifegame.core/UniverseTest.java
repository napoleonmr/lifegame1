package com.tsi.lifegame.core;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class UniverseTest {

/*The universe of the Game of Life is an infinite two-dimensional orthogonal grid of square cells, each of which is in one of two possible states, alive or dead. Every cell interacts with its eight neighbours, 
which are the cells that are horizontally, vertically, or diagonally adjacent. At each step in time, 
the following transitions occur:
Any live cell with fewer than two live neighbours dies, as if caused by under-population.
Any live cell with two or three live neighbours lives on to the next generation.
Any live cell with more than three live neighbours dies, as if by overcrowding.
Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

The initial pattern constitutes the seed of the system. 
The first generation is created by applying the above rules simultaneously to every cell
 in the seed—births and deaths occur simultaneously, and the discrete moment at which this happens 
is sometimes called a tick (in other words, each generation is a pure function of the preceding one). 
The rules continue to be applied repeatedly to create further generations.
*/

	//The universe of the Game of Life is an infinite two-dimensional orthogonal grid of square cells,
	//each of which is in one of two possible states, alive or dead.
	@Test
	public void universeIsATwodimensionalGridofCells(){
		boolean[][] c = { 
					{false,false,false},
					{false,true,false},
					{false,false,false},
			         };
		Universe u = new Universe(c);
		Boolean state = u.isAlive(1,1);
		assertTrue(state);
	}

	@Test
	public void universeIsATwodimensionalGridofDeadCells(){
		boolean[][] c = { 
					{false,false,false},
					{false,false,false},
					{false,false,false},
			         };
		Universe u = new Universe(c);
		Boolean state = u.isAlive(1,1);
		assertFalse(state);
	}


	

	 // Every cell interacts with its eight neighbours, 
	 //which are the cells that are horizontally, vertically, or diagonally adjacent.
	 @Test
	 public void cellinteractsWithItsNeighbours(){
		boolean[][] c = { 
					{true, true, true},
					{true, true, true},
					{true, true, true},
			         };
		Universe u = new Universe(c);
		int n =  u.getLifeNeighbourNumber(1,1);
		assertTrue(n==7);
	 }
} 
