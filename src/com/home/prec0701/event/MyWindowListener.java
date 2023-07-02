package com.home.prec0701.event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowListener implements WindowListener {

	public void windowOpened(WindowEvent e) {
		System.out.println("윈도우 등장");

	}

	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 안녕");

	}

	public void windowClosed(WindowEvent e) {
		System.out.println("윈도우 닫힘");

	}

	public void windowIconified(WindowEvent e) {
		System.out.println("윈도우 최소화");

	}

	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("윈도우 올림");

	}

	
	public void windowActivated(WindowEvent e) {
		System.out.println("윈도우 포커스");

	}

	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("윈도우 낫포커스");

	}

}
