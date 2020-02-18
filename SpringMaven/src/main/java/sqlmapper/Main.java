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
		
		// 전체 데이터를 가져와보기
		List <corona> list = sqlsession.selectList("corona.coronaselectall");
		// List <결과타입> list = sqlsession.selectList("name.id", 파라미터)
		
		for (corona corona :list) {
			System.out.println(corona);
		}
		context.close();
	}

}
