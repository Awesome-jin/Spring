package domain;

public class Item {
	private int num;
	private String name;
	
	// 생성자는 필요없고 Getters and setters, toString까지 설정하기
	/*
	 안된다면 ?????
	 Source 폴더를 하나 만들어서 디렉토리와 파일 옮기고 다시 시도해보기
	  */
	
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
	@Override
	public String toString() {
		return "Item [num=" + num + ", name=" + name + "]";
	}
	
	// 생성자는 필요없고 Getters and setters, toString까지 설정하기
	
	
}
