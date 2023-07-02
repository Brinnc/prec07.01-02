package com.home.prec0701.event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MultipleEvent extends JFrame{
	JButton bt;
	JTextField t;
	JComboBox com;
	
	public MultipleEvent() {
		bt=new JButton("버튼뿅");
		t=new JTextField(25);
		com=new JComboBox();
		
		//레이아웃 변경
		setLayout(new FlowLayout());
		
		//콤보박스에 아이템 추가
		com.addItem("마일스 모랄레스");
		com.addItem("피터 B 파커");
		com.addItem("그웬 스테이시");
		com.addItem("미겔 오하라");
		com.addItem("호비 브라운");
		
		add(bt);
		add(t);
		add(com);
		
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//버튼과 리스너 연결
		bt.addActionListener(new MyButtonListener());
		//텍스트필드와 리스너 연결
		t.addKeyListener(new MyInputListener());
		//콤보박스와 리스너 연결
		com.addItemListener(new MyChangeListener());
		//윈도우(나)와 리스너 연결
		this.addWindowListener(new MyWindowListener());
		
	}
	
	public static void main(String[] args) {
		new MultipleEvent();
	}
}
