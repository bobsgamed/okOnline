package com.bobsgame.client.engine.game.gui.stuffMenu.subMenus;

import org.lwjgl.opengl.Display;

import com.bobsgame.ClientMain;
import com.bobsgame.client.engine.Engine;
import com.bobsgame.client.engine.game.ClientGameEngine;
import com.bobsgame.client.engine.game.gui.GUIManager;
import com.bobsgame.client.engine.game.gui.gameStore.GameStore;
import com.bobsgame.client.engine.game.gui.statusbar.StatusBar;
import com.bobsgame.client.engine.game.gui.stuffMenu.StuffMenu;
import com.bobsgame.client.engine.game.gui.stuffMenu.SubPanel;

import de.matthiasmann.twl.DialogLayout;
import de.matthiasmann.twl.Label;
import de.matthiasmann.twl.ScrollPane;



//=========================================================================================================================
public class LogsPanel extends SubPanel
{//=========================================================================================================================



	//=========================================================================================================================
	public LogsPanel()
	{//=========================================================================================================================

		super();


		//TODO: connect to server and get last x logs






		Label label = new Label("Logs");
		label.setCanAcceptKeyboardFocus(false);

		insideLayout.setHorizontalGroup
		(
				insideLayout.createParallelGroup(label)
		);

		insideLayout.setVerticalGroup
		(
				insideLayout.createSequentialGroup(label)
		);



	}






}
