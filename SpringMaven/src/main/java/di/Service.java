package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//★Bean을 자동으로 생성해주는 annotation인 component 달아주기
@Component
public class Service {
	
	// ★★ 2.Service안에 dao가 들어오는 구조 잊어버리지 말기!
	
	@Autowired
	private Dao dao;
	// autowired : dao 클래스 타입의 bean이 있다면 자동으로 주입해줄게!

	/* autowired를 쓰면 get set이 불필요해진다.
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	*/
	
	public void insert() {
		dao.insert(); //dao의 메소드를 호출한 형태
	}
	
	
}
