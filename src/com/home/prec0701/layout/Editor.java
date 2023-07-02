package com.home.prec0701.layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Editor extends JFrame{
	JMenuBar bar; //상단 메뉴바 영역
	
	JMenu m_file; //메뉴_파일
	JMenu m_edit; //메뉴_편집
	JMenu m_style; //메뉴_속성
	JMenu m_view; //메뉴_보기
	JMenu m_help; //메뉴_도움

	//파일 메뉴 내 8개의 메뉴 아이템
	JMenuItem i_new;
	JMenuItem i_window;
	JMenuItem i_open;
	JMenuItem i_save;
	JMenuItem i_saveas;
	JMenuItem i_page;
	JMenuItem i_print;
	JMenuItem i_exit;
	
	JTextArea area; //텍스트 메모 영역
	JScrollPane scroll_p; //스크롤 생성
	
	public Editor() {
		bar=new JMenuBar();
		
		m_file=new JMenu("파일(F)");
		m_edit=new JMenu("편집(E)");
		m_style=new JMenu("서식(O)");
		m_view=new JMenu("보기(V)");
		m_help=new JMenu("도움(H)");
		
		i_new=new JMenuItem("새로 만들기");
		i_window=new JMenuItem("새창");
		i_open=new JMenuItem("열기");
		i_save=new JMenuItem("저장");
		i_saveas=new JMenuItem("다른 이름으로 저장");
		i_page=new JMenuItem("페이지 설정");
		i_print=new JMenuItem("인쇄");
		i_exit=new JMenuItem("나가기");
		
		area=new JTextArea();
		scroll_p=new JScrollPane(area); //컴포넌트형 인스턴스(텍스트에리어)가 매개변수로 옴
		
		m_file.add(i_new);
		m_file.add(i_window);
		m_file.add(i_open);
		m_file.add(i_save);
		m_file.add(i_saveas);
		//---------------------------
		m_file.addSeparator(); //구분선
		m_file.add(i_page);
		m_file.add(i_print);
		//---------------------------
		m_file.addSeparator(); //구분선
		m_file.add(i_exit);
		
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_style);
		bar.add(m_view);
		bar.add(m_help);
		
		this.setJMenuBar(bar);
		
		//텍스트에리어를 부착하려면 최종적으로는 스크롤을 부착해야함
		this.add(scroll_p, BorderLayout.CENTER);  
		
		this.setSize(800, 700);
		this.setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Editor();
	}
}
