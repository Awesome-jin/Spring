package di;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	
	// ★★ 2.Service안에 dao가 들어오는 구조 잊어버리지 말기!
	
	@Autowired
	private Dao dao;

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
