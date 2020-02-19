package db.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import db.mybatis.domain.Corona;

public interface CoronaDao {
	/*3. corona 테이블의 전체 데이터를 가져오는 메소드
		3-1. 이 형태로 만들어야한다: public 리턴타입 이름 (매개변수);
		3-2.여러개니까 리턴타입은 무조건 리스트로!!
		3-3. 리스트<어떤 형태로 가져와야해?> : 우리가 만든 모든걸 가져와야 하니까 만들어놓은 클래스를 넣어 줘야함
	 */
	
	// 4. 전체 데이터를 선택하는 Select 명령어를 만들어보자
	@Select("select* from corona") // 4-2. Annotation에 SQL 명령어를 쓴다
	public List<Corona> selectall(); // 4-1. selectall은 내가 임의로 붙인 이름
	
	// 5. 기본키로 데이터 하나를 조회 하는것
	@Select("select * from corona where num = #{num}")
	public Corona coronaselectone(int num);
	/* 열이 1개 - 기본 자료형 (String, Date)
	 	열이 복수 - Map, DTO(사용자 정의 클래스)
	 	행이 1개면 위의 자료형 그대로
	 	행이 여러개면 위 자료형의 리스트로!  */
	
	// 6. 데이터를 추가해주는 메소드
	@Insert("insert into corona(num, nation, infnum, death, cured) "
			+ "values(#{num}, #{nation}, #{infnum} , #{death}, #{cured})")
	public int coronainsert(Corona corona);
	
	//7. 데이터를 수정해주는 메소드
	@Update("update corona set nation=#{nation}, "
			+ "infnum=#{infnum}, death=#{death}, cured=#{cured} "
			+ "where num = #{num}")
	public int coronaupdate(Corona corona);
	
	//8. 데이터를 삭제해주는 메소드
	@Delete("delete from corona " + "where num=#{num}")
	public int coronadelete(int num);
	
	/*6~8은 DAO로 하면 안된다!!! 
	업무 프로세스가 행이 몇개 수정됐어요~ 이런식으로 정수형 단위로 움직이기 때문에
	꼭 int로 만들어야한다!! */
}
