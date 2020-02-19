package di;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/*
@Getter //모든 변수의 Getter를 만들어줌
@Setter // 모든 변수의 Setter를 만들어줌
@ToString //toString 만들어줌 
*/

@Data // ★생성자, getter, setter, tostring 다 만들어줌 권장 ★
public class DTO {
	
	@NonNull
	private int num;
	private String name;
	
}
