package com.pk.db.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.pk.db.domain.Item;

public interface ItemService {
	//전체 데이터를 가져오는 메소드
	public List<Item> allItem(HttpServletRequest request);
	
	/*메소드의 이름은 같은데 매개변수의 개수나 자료형이 다른 오버로딩으로 구현*/
	//1개를 가져오는 메소드 만들어보기
	public Item getItem(HttpServletRequest request);
	//파라미터를 읽지 않고 받는 메소드
	public Item getItem(HttpServletRequest request, int itemid);
}
