package com.pk.db;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pk.db.domain.Item;
import com.pk.db.service.ItemService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//Service 객체를 주입
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request, Model model) {
		// 서비스 메소드를 부르자
		List <Item> list = itemService.allItem(request);
		
		// 데이터를 저장해주자
		model.addAttribute("list", list);
		return "home";
	}
	
	/*value에 값이 정확히 맞아야 한다. 여기서 안맞으면 404에러가 나는것
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(HttpServletRequest request, Model model) {
		// 서비스 메소드를 부르자
		Item item = itemService.getItem(request);
		
		// 데이터를 저장해주자
		model.addAttribute("item", item);
		return "detail"; //출력할 페이지 이름
	}*/
	
	// 상세보기 페이지에 타이틀을 item번호로 매겨주는 방법 
	@RequestMapping(value = "/detail/{itemid}", method = RequestMethod.GET)
	public String detail(HttpServletRequest request, Model model, 
			@PathVariable int itemid) {
		// 서비스 메소드를 부르자
		Item item = itemService.getItem(request);
		
		// 데이터를 저장해주자
		model.addAttribute("item", item);
		return "detail"; //출력할 페이지 이름
	
}
}
