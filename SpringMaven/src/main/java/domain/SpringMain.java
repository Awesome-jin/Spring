package domain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		/* SpringContainer 클래스 객체 만들기
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Factory.class);
		*/
		
		//XML을 이용한다면?
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:applicationcontext.xml");
		
		/*Bean 생성 메소드를 호출해서 Bean을 생성
		Item item1 = context.getBean("create", Item.class);
		
		item1.setNum(1);
		item1.setName("종현");
		System.out.println(item1);
		
		Item item2 = context.getBean("create", Item.class);
		item2.setNum(2);
		item2.setName("태연");
		System.out.println(item2);
		*/
		
		// 똑같은 작업을 xml 파일로 한다면? 매개변수 자리에 메소드 이름 대신 id를 쓰면 된다.
		Item item1 = context.getBean("item", Item.class);
		
		item1.setNum(1);
		item1.setName("종현");
		System.out.println(item1);
		
		Item item2 = context.getBean("item", Item.class);
		item2.setNum(2);
		item2.setName("태연");
		System.out.println(item2);
		
		
		System.out.println(item1.hashCode() == item2.hashCode());
		// true or false로 두개의 해시코드가 같은지 다른지 비교해보자!
		
		

	}

}
