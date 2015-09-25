package com.acme.lifegame.cmd;

import com.acme.lifegame.core.Universe;

class Cmd{

	public static void main(String [ ] args){
		boolean[][] c = { 
					{false,false,false},
					{false,true,false},
					{false,false,false},
			         };
		Universe u = new Universe(c);
		
		for(;;){
			u.tick();
		}
		
    	}
	
} 
