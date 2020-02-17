
public class OldMain {

	public static void main(String[] args) {
		//Temp temp = new Temp();
		// Factory에서 만든 create라는 메소드를 불러서 생성하기
		Temp temp = TempFactory.create();
		temp.setNum(1);
		temp.setName("종현");
		System.out.println(temp);
	}

}
