package sqlmapper;

import lombok.Data;

//접근자 메소드와 toString 메소드를 만들어주는 Annotation
@Data
public class corona {
	private int num;
	private String nation;
	private int infnum;
	private int death;
	private int cured;
}
