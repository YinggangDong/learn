package com.learn.first.knightimpl;

import com.learn.first.knightinterfaces.Knight;
import com.learn.first.questinterface.Quest;

/**
 * 勇气骑士
 * 
 * @author dongyinggang
 *
 */
public class BraveKnight implements Knight {
	
	private Quest quest;
	
	/**
	 * 重载的构造方法
	 * Quest被注入进BraveKnight，BraveKnight可以进行各种探险，这就是松耦合
	 * @param quest quest接口，可以是quest的各种实现类
	 */
	public BraveKnight(Quest quest){
		this.quest = quest;
	}
	
	public void embarkOnQuest(){
		quest.embark();
	}
}
