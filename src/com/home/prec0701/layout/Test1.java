package com.home.prec0701.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;

public class Test1 {
	public static void main(String[] args) {
		Frame f = new Frame(); // 1) 윈도우 생성
		f.setSize(500, 400); // 2) 윈도우 사이즈 설정

		//BorderLayout br=new BorderLayout();
		f.setLayout(new BorderLayout()); // 4) 프레임에 보더레이아웃 적용

		// 패널은 현실의 판자를 표현한 것이며, 색상이 없음
		Panel[] p = new Panel[5];
		for (int i = 0; i < p.length; i++) {
			p[i] = new Panel(); // 5) 배열의 각 요소에 패널을 생성해 대입
		}

		// 6) 패널에 배경색 설정
		p[0].setBackground(Color.LIGHT_GRAY); // 북
		p[1].setBackground(Color.LIGHT_GRAY); // 남
		p[2].setBackground(Color.CYAN); // 동
		p[3].setBackground(Color.CYAN); // 서
		p[4].setBackground(Color.WHITE); // 중앙

		// 7) 패널 사이즈 설정
		p[0].setPreferredSize(new Dimension(500, 100));
		p[1].setPreferredSize(new Dimension(500, 100));
		p[2].setPreferredSize(new Dimension(100, 200));
		p[3].setPreferredSize(new Dimension(100, 200));
		p[4].setPreferredSize(new Dimension(300, 200));

		// 8) 북쪽에 0번째 패널 부착
		f.add(p[0], BorderLayout.NORTH);
		// -) 남쪽에 1번째 패널 부착
		f.add(p[1], BorderLayout.SOUTH);
		// -) 서쪽에 2번째 패널 부착
		f.add(p[2], BorderLayout.WEST);
		// -) 동쪽에 3번째 패널 부착
		f.add(p[3], BorderLayout.EAST);
		// -) 중앙에 4번째 패널 부착
		f.add(p[4], BorderLayout.CENTER);

		// 9) 버튼 2개 생성해 남쪽 패널에 부착
		Button bt1 = new Button("Login");
		Button bt2 = new Button("Regist");
		
		p[1].add(bt1);
		p[1].add(bt2);

		f.setVisible(true); // 3) 윈도우 시각화
	}
}
