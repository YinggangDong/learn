package com.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.first.knightinterfaces.Knight;
import com.learn.first.minstrel.Minstrel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
    }
}
