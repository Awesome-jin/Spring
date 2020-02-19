package db.mybatis.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import db.mybatis.dao.CoronaDao;
import db.mybatis.domain.Corona;

//1. bean 자동으로 생성하게 어노테이션 달아주기
@Service
public class CoronaService {
	//2. 동일한 자료형 bean이 있으면 자동으로 주입해주는 어노테이션
	@Autowired
	private CoronaDao coronaDao;
	
	//3. 데이터 삽입 메소드 
	@Transactional //Manual commit이 적용되고 메소드 수행도중 예외가 생기면 rollback
	public int coronainsert(Corona corona) {
		coronaDao.coronainsert(corona);
		return coronaDao.coronainsert(corona); //일부러 에러내보려고 2번 불러주는 라인
	}
}
