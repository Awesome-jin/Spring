package di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*자바에서 Controller의 insert 메소드를 호출해보기 ============================

		Dao dao = new Dao(); //1단계의 dao 인스턴스 만들기
		Service service = new Service(); //2단계의 service 인스턴스 만들기
		service.setDao(dao); // 2단계에서 만든 service 인스턴스에 dao 넣기
		 
		Controller controller = new Controller(); //3단계 controller 인스턴스 만들기
		controller.setService(service); //controller에 2단계에서 만든 service 넣기
		
		controller.insert(); //controller에서 dao가 만든 메소드 호출하기
		*/
		
		// Spring 스타일로 똑같이 메소드를 호출해보자 ==================================
		//1. app.xml bean에서 설정한 파일 내용을 가져와야 한다.
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:app.xml");
		
		// 2. dao의 인스턴스를 만들어주기
		/*Dao dao = context.getBean("dao", Dao.class);
		
		//3. service의 인스턴스를 만들고 dao 넣어주기
		Service service = context.getBean("service", Service.class);
		
		 3-1. 설정 파일에서 주입을 했다면 주입하는 코드는 필요가 없어진다
		service.setDao(dao); >>bean에서 설정 안했으면 필요함!!! */
		
		// 4.controller의 인스턴스를 만들어서 service 넣어주기
		Controller controller = context.getBean("controller", Controller.class);
		/* 4-1. 설정 파일에서 주입을 했다면 주입하는 코드는 필요가 없어진다
		controller.setService(service); */
		
		// 5. controller에서 dao의 메소드 호출하기
		controller.insert();
		context.close();
		
	}

}
