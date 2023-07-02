package com.home.prec0701.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyInputListener implements KeyListener{

	
	public void keyTyped(KeyEvent e) {
	
		
	}

	
	public void keyPressed(KeyEvent e) {
		System.out.println("키보드 누르면 발생하는 이벤트임");
		
	}

	
	public void keyReleased(KeyEvent e) {
		System.out.println("키보드 눌렀다가 떼면 발생하는 이벤트임");
		
	}

}
