package com.bobsgame.client.engine.game.nd.ramio;

import com.bobsgame.client.engine.Engine;
import com.bobsgame.client.engine.EnginePart;
import com.bobsgame.client.engine.entity.Entity;

//=========================================================================================================================
public class BrickBlock extends Block
{//=========================================================================================================================
	
	
	
	//=========================================================================================================================
	public BrickBlock(Engine g)
	{//=========================================================================================================================
		super(g);
		
	}
	
	

	public int open=0;
	public int contains=0;


	
	//=========================================================================================================================
	public void hit()
	{//=========================================================================================================================
		
		AudioManager().playSound("ramiobrickthud",64,44100,0);

		//TODO:if small ramio, just bounce
		//else destroy

	}
}
