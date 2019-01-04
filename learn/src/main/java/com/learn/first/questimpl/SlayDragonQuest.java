package com.learn.first.questimpl;

import java.io.PrintStream;

import com.learn.first.questinterface.Quest;

/**
 * 屠龙骑士
 * @author dongyinggang
 *
 */
public class SlayDragonQuest implements Quest {
	
	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream stream) {
		this.stream =stream;
	}
	
	public void embark() {
		stream.println("Embarking on quest to slay the dragon!");
	}
}
