
public class Temp {
	
	private int num;
	private String name;
	
	/*
	 Constructor and superclass set의 순서는 상관 없음
	 */
	
	// 다른 곳에서 사용 할 수 있게 생성자 지정해주기
	public Temp(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	// 얘가 상속해주는 superclass야 정의
	public Temp() {
		super();
	}

	//데이터 집어넣고 확인하게 해주는 getters and setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//빠른 확인을 도와주는 toString 까지 기본 작업!
	@Override
	public String toString() {
		return "Temp [num=" + num + ", name=" + name + "]";
	}
	
	
}
