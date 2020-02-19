package di;

import org.springframework.stereotype.Component;

// 1. Dao 클래스에 아무 메소드나 생성하기

//★Bean을 자동으로 생성해주는 annotation인 component 달아주기
@Component
public class Dao {
	public void insert() {
		System.out.println("데이터 삽입 성공");
	}
}
