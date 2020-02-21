package db.hibernate;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import db.hibernate.dao.CoronaDao;
import db.hibernate.domain.Corona;

public class HibernateMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:hibernateContext.xml");
		
		CoronaDao dao = context.getBean(CoronaDao.class);
		
		/*
		Corona cor = new Corona();
		cor.setNum(530);
		dao.coronadelete(cor);
		*/
		
		/* 데이터 전체 읽기 hibernate type
		2렬<1행>로 판단하기
		전체를 읽어야하니까 행렬로 읽어와야 하는데 여러개를 담으려면 1은 DTO
		2는 List
	
		List<Corona> list = dao.coronaselectall();
		for(Corona corona : list) {
			System.err.println(corona);
		} */
		

		
		/*데이터 1개 읽기
		Corona cor = dao.coronaselectone(2);
		System.err.println(cor); */
		
		context.close();
	}

}
