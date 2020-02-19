package db.mybatis;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import db.mybatis.dao.CoronaDao;
import db.mybatis.domain.Corona;
import db.mybatis.service.CoronaService;

public class MyBatisMain {

	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		// CoronaDao dao = con.getBean("coronaDao", CoronaDao.class);
		// System.err.println(dao.selectall());

		/*
		 * 1.전체 데이터를 가져오는 메소드를 호출해보기! List<Corona> list = dao.selectall(); // 리스트로 결과를
		 * 출력했는데 안떠? 그럼 안에 데이터가 없는 것. for(Corona corona : list) {
		 * System.err.println(corona); }
		 */

		/*
		 * 2. Selectone 기본키로 1개의 데이터를 리턴 받는 메소드 호출해보기 //2-1. 1개니까 리스트일 필요가 없다. Corona
		 * corona = dao.coronaselectone(20); // 2-2. 20같이 없는 기본키를 넣으면 null을 리턴한다.
		 * System.err.println(corona);
		 */

		/*
		 * 3. 삽입하는 메소드 //3-1. 일단 뭘 어떻게 넣을건지 선언부터 해준다. Corona corona = new Corona();
		 * corona.setNum(10); corona.setNation("대구"); corona.setInfnum(11);
		 * corona.setDeath(0); corona.setCured(0);
		 * 
		 * //3-2. 위에서 선언한 변수들을 메소드를 호출해서 넣어준다. int result = dao.coronainsert(corona);
		 * 
		 * //3-3. DML들은 정수형태로 작업하기 때문에 분기를 해준다. if(result>0) { System.out.println("성공");
		 * }else { System.out.println("실패"); }
		 */

		/*
		 * 4. 수정하는 메소드 // 4-1. 일단 뭘 어떻게 수정할지 선언부터 해준다. Corona corona = new Corona();
		 * corona.setNum(10); corona.setInfnum(13);
		 * 
		 * // 4-2. 위에서 선언한 변수들을 메소드를 호출해서 넣어준다. try { int result =
		 * dao.coronainsert(corona);
		 * 
		 * // 4-3. DML들은 정수형태로 작업하기 때문에 분기를 해준다. if (result > 0) {
		 * System.out.println("수정 성공"); } else { System.out.println("수정할 데이터가 없음"); } }
		 * catch (Exception e) { System.err.println("실패");
		 * System.err.println(e.getMessage()); }
		 */

		/* 5 삭제
		try {
			int result = dao.coronadelete(10);
			if (result > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제할 데이터가 없음");
			}
		} catch (Exception e) {
			System.err.println("실패");
			System.err.println(e.getMessage());
		}
		*/
		
		//6. 삽입할 데이터 생성
		Corona corona = new Corona();
		corona.setNum(534);
		corona.setInfnum(15);
		corona.setCured(0);
		corona.setDeath(0);
		corona.setNation("신천지");
		
		//6-1. Service 객체 가져오기
		CoronaService serv = con.getBean(CoronaService.class);
		serv.coronainsert(corona);
		con.close();
	}
}
