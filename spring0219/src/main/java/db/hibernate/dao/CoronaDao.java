package db.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import db.hibernate.domain.Corona;

//이 어노테이션은 bean 생성을 자동으로 해준다
@Repository 
public class CoronaDao {
	
	// 하이버네이트 사용 변수를 생성하는 방법
	@Autowired
	private SessionFactory sessionFactory;
	
	
	//1. 데이터 삽입하는 메소드 만들어보기
	@Transactional
	public int coronainsert(Corona corona) {
		sessionFactory.getCurrentSession().save(corona);
		return 1;
	}
	
	//2. 데이터 업데이트 해주는 메소드 구현
	@Transactional
	public void coronaupdate(Corona corona) {
		sessionFactory.getCurrentSession().update(corona);
	}
	
	//3. 데이터 삭제 해주는 메소드 구현
	@Transactional
	public void coronadelete(Corona corona) {
		sessionFactory.getCurrentSession().delete(corona);
		}
	
	//4. 데이터를 전부 가져오는 메소드 구현
	@Transactional
	public List<Corona> coronaselectall(){
		//return sessionFactory.getCurrentSession().createCriteria(Corona.class).list();
		
		/*SQL을 이용한 방법도 가능하다.
		메소드의 리턴값을 가지고 다른 메소드를 계속 호출하는 구조를 메소드 체이닝이라고 한다.
		R의 파이프연산자 %>%와 같은 원리 */
		return sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM CORONA")
				.addEntity(Corona.class).getResultList();
	}
	
	//5. 데이터 하나를 가져오는 메소드
	@Transactional
	public Corona coronaselectone(int num){
		return sessionFactory.getCurrentSession().get(Corona.class, num);
	}
	
}
