package com.learn.first.knightimpl;

import com.learn.first.knightinterfaces.Knight;
import com.learn.first.questimpl.RescueDamselQuest;

/**
 * 少女救援骑士类
 * @author dongyinggang
 *
 */
public class DamselRescuingKnight implements Knight {
	
	/**
	 * 此处导致DamselRescuingKnight与RescueDamselQuest紧耦合
	 */
	private RescueDamselQuest quest;
	
	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}
	
	public void embarkOnQuest(){
		quest.embark();
	}
}
