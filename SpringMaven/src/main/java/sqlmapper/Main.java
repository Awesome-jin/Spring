package sqlmapper;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.hibernate.metamodel.relational.Database;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:mybatis.xml");
	
		/* 데이터베이스 연결정보 가져오기
		DataSource ds = context.getBean("dataSource", DataSource.class);	
		try {
			Connection con = ds.getConnection();
			System.out.println(con);
			con.close();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		*/
		//데이터베이스 연결 정보 가져오기 
		SqlSession sqlsession = context.getBean("sqlSession", SqlSession.class);
		
		/* 전체 데이터를 가져와보기
		List <corona> list = sqlsession.selectList("corona.coronaselectall");
		// List <결과타입> list = sqlsession.selectList("name.id", 파라미터)
		
		// 리스트를 순회하면서 결과를 출력하기
		for (corona corona :list) {
			System.out.println(corona);
		}
		*/
		
		//기본키 num을 가지고 데이터를 찾아오는 SQL 호출
		// num은 기본키니까 이걸로 데이터를 조회하면 없거나 1개만 조회됨
		
		// corona cor = sqlsession.selectOne("corona.coronaselect",2);
		// System.err.println(cor);  

  		//데이터를 삽입하는 SQL을 호출
  		// id = coronainsert  parameter = corona (corona라는 클래스가 필요하기 때문에 인스턴스를 만들어서 넣는것)
		/*corona cor = new corona();
  		
  		cor.setNum(11);
  		cor.setNation("호주");
  		cor.setDeath(1);
  		cor.setInfnum(15);
  		cor.setDeath(2);
  		
  		//name.id, 파라미터는 클래스가 필요하므로 인스턴스를 넣어주기
  		int result = sqlsession.insert("corona.coronainsert",cor);
  		
  		insert는 1이상이 리턴되면 삽입 성공
  		if(result>0) {
  			System.err.println("삽입성공");
  		}else {
  			System.err.println("실패");
  		} 
  		*/
  		
  		/* update는 insert와 매우매우 비슷하다!
  		corona cor = new corona();
  
  		cor.setNum(11);
  		cor.setNation("호주");
  		cor.setDeath(1);
  		cor.setInfnum(11); 
  		cor.setDeath(2); 
  		
  		//name.id, 파라미터는 클래스가 필요하므로 인스턴스를 넣어주기
  		int result = sqlsession.update("corona.coronaupdate",cor);
  		
  		//로직은 유사하지만 아래 알고리즘이 조금 다르다
  		// 0이 리턴되면 조건에 맞는 데이터가 없어서 수정을 안하는 것이고
  		// 문제가 생기면 예외를 발생!
 
  		if(result>0) {
  			System.err.println("수정성공");
  		}else {
  			System.err.println("수정할 데이터가 없음");
  		}
  		*/
		
		// delete
		int r = sqlsession.delete("corona.coronadelete", 12);
		// delete는 1이상이 리턴되면 삭제된 데이터가 있음
		// 0이 리턴되면 조건에 맞는 데이터가 없어서 삭제를 안함
		// 문제가 생기면 예외
  		if(r>0) {
  			System.err.println("수정성공");
  		}else {
  			System.err.println("수정할 데이터가 없음");
  		}	
		context.close();
	}

}
