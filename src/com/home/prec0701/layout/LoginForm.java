package com.home.prec0701.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class LoginForm extends Frame { // LoginForm is a Frame
	Label la_id;
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_signIn;
	Button bt_signUp;
	Panel p_center; // 패널의 디폴트 레이아웃은 FlowLayout
	Panel p_south; // 패널의 디폴트 레이아웃은 FlowLayout

	// 프레임과 프레임이 보유하고 있는 컴포넌트들을 초기화함
	public LoginForm() {
		la_id = new Label("ID");
		la_pass = new Label("Password");
		t_id = new TextField();
		t_pass = new TextField();
		bt_signIn = new Button("Sign In");
		bt_signUp = new Button("Sign Up");
		p_center = new Panel();
		p_south = new Panel();

		la_id.setBackground(Color.LIGHT_GRAY);

		p_center.setLayout(new GridLayout(2, 2));

		p_center.add(la_id); // (0,0)
		p_center.add(t_id); // (0,1)
		p_center.add(la_pass); // (1,0)
		p_center.add(t_pass); // (1,1)

		p_south.add(bt_signIn);
		p_south.add(bt_signUp);

		this.add(p_center, BorderLayout.CENTER); // 프레임의 디폴트 레이아웃은 BorderLayout
		this.add(p_south, BorderLayout.SOUTH); // 프레임의 디폴트 레이아웃은 BorderLayout

		this.setSize(300, 120);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		LoginForm form = new LoginForm();
	}
}
