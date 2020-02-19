package db.hibernate.domain;

import lombok.Data;

@Data //2.lombok이 있다면 @Data로 생성자와 접근자를 모두 설정해주자.
public class Corona {
	private int num;
	private String nation;
	private int infum;
	private int death;
	private int cured;
	//1. hibernate은 이름까지 똑같을 필욘 없다 (뒤에 매칭해주는데서 맞춰주기만 하면됨) 자료형을 주의히자.

}
