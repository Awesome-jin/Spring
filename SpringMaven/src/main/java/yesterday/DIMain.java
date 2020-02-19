package yesterday;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DIMain {

	public static void main(String[] args) {
		// 1. 스프링 설정 파일의 경로 설정
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:diconfig.xml");
		// classpath는? src 또는 src/main의 java 또는 src/main/resources

		// 2. bean 찾아오기
		// 클래스 변수이름 = context.getBean("id", 클래스이름.class);
		DTO dto = context.getBean("dto", DTO.class);
		System.out.println(dto.getName());
		
		DTO dto1 = context.getBean("dto1", DTO.class);
		System.out.println(dto1.getName());
		
		//cf. 중간에 없는데도 경로 문제 생기면? 우클릭 >>>Maven>>> 업데이트 해주기
		
		DTO dto2 = context.getBean("dto2",DTO.class);
		System.out.println(dto2.getName());
		context.close();
	
	}
}