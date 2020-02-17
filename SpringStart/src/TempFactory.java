public class TempFactory {
	
	//FactoryMethodPattern으로 작업해보기
	
	//Temp 클래스의 Factory 클래스
	static Temp temp = new Temp();  //Static으로 temp 인스턴스는 하나밖에 없다고 정의해버리면?
	public static Temp create() { //Temp의 Factory 메소드
		return temp; //static이니까 this 붙일 필요 없음
		/*
		이제 몇번의 temp를 갖다 써도 hashcode를 찍어보면 static이기 때문에 계속 같은 값이 나온다.
		 */
	}
}
