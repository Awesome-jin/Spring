package domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // Bean Container 설정하기
public class Factory {
	/*자동 Singleton 적용 : 처음 1개를 만들고 이 메소드를 재호출하면 만들어진 걸 다시 리턴함*/
	@Bean 
	public static Item create(){ 
		return new Item();
	}
}
