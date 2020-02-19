package Spring0218;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import di.Service;

@RunWith(SpringJUnit4ClassRunner.class) // 주의. 이코드 직접 써야 import해줌. 복붙하면 안됨
@ContextConfiguration("classpath:app.xml") //app.xml의 모든 내용을 수행함

public class Testing {
	
	@Autowired
	private Service service;
	
	//테스트용 메소드 만들기
	@Test
	public void method() {
		service.insert();
	}

}
