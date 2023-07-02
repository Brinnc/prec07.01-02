package com.home.prec0701.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWin extends JFrame{
	JButton bt;
	
	public MyWin() {
		bt=new JButton("이건 스윙 버튼임");
		
		this.setLayout(new FlowLayout());
		
		add(bt);
		
		this.setSize(300, 400);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyWin();
	}
}
