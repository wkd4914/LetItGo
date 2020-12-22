package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 NEW 하는건 아니고,
//특정 어노테이션이 붙어 있는 클래스 파일들을 new 해서(IOC) 스프링 컨테이너에 관리해준다.
@Controller
public class BlogControllerTest {

	@RequestMapping(value = "/")
	public String hello(Model m) {
		return "index";
	}
	
}
