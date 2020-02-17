package DI;

public class DTO {
	
	private String name;

	public DTO() {
		super();
	}

	public DTO(String name) {
		super();
		this.name = name;
	}

	/*
	여기서 get뒤에 무언가를 소문자로 바꾸면 property가 되는 것.
	변수명과 get뒤의 이름이 다를 수 있으니 꼭 property이름은 확인하자
	*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// -- 여기까지 해주면 name이라는 String 변수가 프로퍼티가 되는 것! --
	
}
