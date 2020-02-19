package db.mybatis.domain;

import lombok.Data;

//2. lombok이 설치되어있으면 @Data를 선언해주자
@Data
public class Corona {
	//1. DB에서 만든 자료형, 변수명에 유의해서 생성해준다
	private int num;
	private String nation;
	private int infnum;
	private int death;
	private int cured;
}
