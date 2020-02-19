package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//★Bean을 자동으로 생성해주는 annotation인 component 달아주기
@Component
public class Controller {
	
	//3. Controller를 추가하고 작성하기
	@Autowired
	private Service service;
	
	/* service와 마찬가지로 Autowired를 쓰면 get과 set이 필요가 없어진다.
	public Service getService() {
		return service;
	}
	
	public void setService(Service service) {
		this.service = service;
	}
	*/
	
	public void insert() {
		service.insert();
	}

}
