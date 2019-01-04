package com.learn.first.questimpl;

import com.learn.first.questinterface.Quest;

/**
 * 少女救援需求
 * @author dongyinggang
 *
 */
public class RescueDamselQuest implements Quest{
	
	/**
	 * embark 从事
	 */
	public void embark(){
		System.out.println("救援少女");
	}
}
